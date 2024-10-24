package pe.edu.upc.aaw.tf_finanzas.servicesinterfaces;


import pe.edu.upc.aaw.tf_finanzas.entities.Reporte;

import java.util.List;

public interface IReporteService {
    public void insert(Reporte reporte);
    public List<Reporte> vrlist();
    public void delete(int idReporte);
    public Reporte listId(int idReporte);
}
