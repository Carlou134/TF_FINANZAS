package pe.edu.upc.aaw.tf_finanzas.servicesinterfaces;

import pe.edu.upc.aaw.tf_finanzas.entities.UserCartera;

import java.util.List;

public interface IUserCarteraService {
    public void insert(UserCartera rol);
    public List<UserCartera> list();
    public void delete(int idUserCartera);
    public UserCartera listarId(int idUserCartera);
}
