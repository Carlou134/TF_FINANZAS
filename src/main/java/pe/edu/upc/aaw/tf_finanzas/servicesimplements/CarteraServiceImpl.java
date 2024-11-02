package pe.edu.upc.aaw.tf_finanzas.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.tf_finanzas.entities.Cartera;
import pe.edu.upc.aaw.tf_finanzas.repositories.ICarteraRepository;
import pe.edu.upc.aaw.tf_finanzas.servicesinterfaces.ICarteraService;

import java.util.List;

@Service
public class CarteraServiceImpl implements ICarteraService {
    @Autowired
    private ICarteraRepository vrCR;

    @Override
    public void insert(Cartera cartera) {
        vrCR.save(cartera);
    }

    @Override
    public List<Cartera> vrlist() {
        return vrCR.findAll();
    }

    @Override
    public void delete(int idCartera) {
        vrCR.deleteById(idCartera);
    }

    @Override
    public Cartera listId(int idCartera) {
        return vrCR.findById(idCartera).orElse(new Cartera());
    }

    @Override
    public List<Cartera> findCarteraByIdUser(int idUsuario) {
        return vrCR.findCarteraByIdUser(idUsuario);
    }


}
