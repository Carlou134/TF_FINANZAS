package pe.edu.upc.aaw.tf_finanzas.servicesinterfaces;

import pe.edu.upc.aaw.tf_finanzas.entities.Facturas;

import java.util.List;

public interface IFacturasService {
    public void insert(Facturas facturas);
    public List<Facturas> vrlist();
    public void delete(int idFactura);
    public Facturas listId(int idFactura);
}
