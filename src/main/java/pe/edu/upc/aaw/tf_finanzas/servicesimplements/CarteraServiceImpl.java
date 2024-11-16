package pe.edu.upc.aaw.tf_finanzas.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.tf_finanzas.entities.Cartera;
import pe.edu.upc.aaw.tf_finanzas.entities.Documentos;
import pe.edu.upc.aaw.tf_finanzas.repositories.ICarteraRepository;
import pe.edu.upc.aaw.tf_finanzas.servicesinterfaces.ICarteraService;
import pe.edu.upc.aaw.tf_finanzas.servicesinterfaces.IDocumentosService;
import pe.edu.upc.aaw.tf_finanzas.servicesinterfaces.IValorDolarService;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarteraServiceImpl implements ICarteraService {
    @Autowired
    private ICarteraRepository vrCR;

    @Autowired
    private IDocumentosService documentosService;

    @Autowired
    private IValorDolarService valorDolarService;

    @Override
    public void insert(Cartera cartera) {
        vrCR.save(cartera);
    }

    @Override
    public List<Cartera> vrlist() {
        return vrCR.findAll();
    }

    @Override
    public void delete(int idCartera) {
        vrCR.deleteById(idCartera);
    }

    @Override
    public Cartera listId(int idCartera) {
        return vrCR.findById(idCartera).orElse(new Cartera());
    }

    @Override
    public List<Cartera> findCarteraByIdUser(long idUsuario) {
        return vrCR.findCarteraByIdUser(idUsuario);
    }

    @Override
    public List<LocalDate> getDiasCarteraById(int idCartera) {
        return vrCR.getDiasCarteraById(idCartera);
    }

    @Override
    public void updateCalculos(int idCartera) {
        try {
            Cartera cartera = vrCR.findById(idCartera)
                    .orElseThrow(() -> new RuntimeException("Cartera no encontrada"));
            List<Documentos> documentos = documentosService.findDocumentosByIdCartera(idCartera);
            String monedaCartera = cartera.getMoneda();
            Double valorDolar = valorDolarService.findLastDolarValue();

            double totalValorNeto = 0.0;
            double totalValorNominal = 0.0;

            for (Documentos doc : documentos) {
                double tea = calculateTEA(doc.getDias_descuento(), doc.getTasa_descuento() / 100);
                double totalCostos = doc.getPortes() + doc.getComision_estudios() + doc.getComision_desembolso() + doc.getComision_cobranza() + doc.getIgv();
                double valorNominal = doc.getValor_nominal();
                double valorNetoAjustado = (valorNominal - totalCostos) / Math.pow(1 + tea, calculateYears(doc.getFecha_emision(), doc.getFecha_vencimiento()));  // Descontando al presente

                // Conversión de moneda si las monedas no coinciden
                if (!monedaCartera.equals(doc.getMoneda())) {
                    valorNetoAjustado = convertirMoneda(valorNetoAjustado, monedaCartera, doc.getMoneda(), valorDolar);
                }

                totalValorNeto += valorNetoAjustado;
                totalValorNominal += valorNominal;
            }

            // Cálculo de TCEA usando la fórmula proporcionada
            double tcea = calculateTCEA(totalValorNeto, totalValorNominal, 360, 360); // Suponiendo que tanto TEP como días a trasladar son 360
            cartera.setTotal_valor_neto(totalValorNeto);
            cartera.setTotal_valor_nominal(totalValorNominal);
            cartera.setTcea(tcea * 100); // Convertir a porcentaje
            vrCR.save(cartera);

        } catch (Exception e) {
            throw new RuntimeException("Error al actualizar los cálculos: " + e.getMessage());
        }
    }

    private double calculateTCEA(double C, double S, int diasTEP, int diasTrasladar) {
        return Math.pow((S / C), ((double) diasTrasladar / diasTEP)) - 1;
    }

    private double calculateYears(LocalDate start, LocalDate end) {
        return ChronoUnit.DAYS.between(start, end) / 365.25;
    }

    private double convertirMoneda(double monto, String monedaCartera, String monedaDocumento, double tipoCambio) {
        if (monedaCartera.equals("SOLES") && monedaDocumento.equals("DOLARES")) {
            return monto * tipoCambio;
        } else if (monedaCartera.equals("DOLARES") && monedaDocumento.equals("SOLES")) {
            return monto / tipoCambio;
        }
        return monto;  // No adjustment needed if currencies are the same
    }

    private double calculateTEA(int diasDescuento, double tasaDescuento) {
        if (diasDescuento == 360) {
            return tasaDescuento;
        } else {
            return Math.pow(1 + tasaDescuento, 360.0 / diasDescuento) - 1;
        }
    }
}
