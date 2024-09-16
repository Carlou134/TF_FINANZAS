package pe.edu.upc.aaw.tf_finanzas.servicesinterfaces;

import pe.edu.upc.aaw.tf_finanzas.entities.Role;

import java.util.List;

public interface IRoleService {
    public List<Role> list();
    public void insert(Role role);
    public void delete(int id);
    public Role listId(int id);
}
