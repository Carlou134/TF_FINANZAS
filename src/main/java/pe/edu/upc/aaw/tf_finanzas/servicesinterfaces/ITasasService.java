package pe.edu.upc.aaw.tf_finanzas.servicesinterfaces;

import pe.edu.upc.aaw.tf_finanzas.entities.Tasas;

import java.util.List;

public interface ITasasService {
    public void insert(Tasas tasas);
    public List<Tasas> vrlist();
    public void delete(int IdTasa);
    public Tasas listId(int IdTasa);
}
