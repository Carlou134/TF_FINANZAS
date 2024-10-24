package pe.edu.upc.aaw.tf_finanzas.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.tf_finanzas.entities.Facturas;
import pe.edu.upc.aaw.tf_finanzas.repositories.IFacturasRepository;
import pe.edu.upc.aaw.tf_finanzas.servicesinterfaces.IFacturasService;

import java.util.List;

@Service
public class FacturasServiceImpl implements IFacturasService {
    @Autowired
    private IFacturasRepository vrfR;


    @Override
    public void insert(Facturas facturas) {
        vrfR.save(facturas);
    }

    @Override
    public List<Facturas> vrlist() {
        return vrfR.findAll();
    }

    @Override
    public void delete(int idFactura) {
        vrfR.deleteById(idFactura);
    }

    @Override
    public Facturas listId(int idFactura) {
        return vrfR.findById(idFactura).orElse(new Facturas());
    }
}
