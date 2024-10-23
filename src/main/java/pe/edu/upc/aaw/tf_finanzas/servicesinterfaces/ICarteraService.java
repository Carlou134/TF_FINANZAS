package pe.edu.upc.aaw.tf_finanzas.servicesinterfaces;

import pe.edu.upc.aaw.tf_finanzas.entities.Cartera;

import java.util.List;

public interface ICarteraService {
    public void insert(Cartera cartera);
    public List<Cartera> vrlist();
    public void delete(int idCartera);
    public Cartera listId(int idCartera);
}
