package pe.edu.upc.aaw.tf_finanzas.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.tf_finanzas.entities.Reporte;
import pe.edu.upc.aaw.tf_finanzas.repositories.IReporteRepository;
import pe.edu.upc.aaw.tf_finanzas.servicesinterfaces.IReporteService;

import java.util.List;

@Service
public class ReporteServiceImpl implements IReporteService {
    @Autowired
    private IReporteRepository vrrR;


    @Override
    public void insert(Reporte reporte) {
        vrrR.save(reporte);
    }

    @Override
    public List<Reporte> vrlist() {
        return vrrR.findAll();
    }

    @Override
    public void delete(int idReporte) {
        vrrR.deleteById(idReporte);
    }

    @Override
    public Reporte listId(int idReporte) {
        return vrrR.findById(idReporte).orElse(new Reporte());
    }
}
