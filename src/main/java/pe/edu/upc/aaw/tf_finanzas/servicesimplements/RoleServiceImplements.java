package pe.edu.upc.aaw.tf_finanzas.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.tf_finanzas.entities.Role;
import pe.edu.upc.aaw.tf_finanzas.repositories.RoleRepository;
import pe.edu.upc.aaw.tf_finanzas.servicesinterfaces.IRoleService;
import pe.edu.upc.aaw.tf_finanzas.servicesinterfaces.IUserService;

import java.util.List;

@Service
public class RoleServiceImplements implements IRoleService {
    @Autowired
    private RoleRepository rR;


    @Override
    public List<Role> list() {
        return rR.findAll();
    }

    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public Role listId(int id) {
        return rR.findById(id).orElse(new Role());
    }
}
