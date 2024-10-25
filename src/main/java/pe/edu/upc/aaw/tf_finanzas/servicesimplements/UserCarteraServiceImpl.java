package pe.edu.upc.aaw.tf_finanzas.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.aaw.tf_finanzas.entities.UserCartera;
import pe.edu.upc.aaw.tf_finanzas.repositories.IUserCarteraRepository;
import pe.edu.upc.aaw.tf_finanzas.servicesinterfaces.IUserCarteraService;

import java.util.List;

@Service
public class UserCarteraServiceImpl implements IUserCarteraService {
    @Autowired
    private IUserCarteraRepository ucR;

    @Override
    public void insert(UserCartera rol) {
        ucR.save(rol);
    }

    @Override
    public List<UserCartera> list() {
        return ucR.findAll();
    }

    @Override
    public void delete(int idUserCartera) {
        ucR.deleteById(idUserCartera);
    }

    @Override
    public UserCartera listarId(int idUserCartera) {
        return ucR.findById(idUserCartera).orElse(new UserCartera());
    }
}
