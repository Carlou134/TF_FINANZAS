package pe.edu.upc.aaw.tf_finanzas.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.tf_finanzas.entities.Tasas;
import pe.edu.upc.aaw.tf_finanzas.repositories.ITasasRepository;
import pe.edu.upc.aaw.tf_finanzas.servicesinterfaces.ITasasService;

import java.util.List;

@Service
public class TasasServiceImpl implements ITasasService {
    @Autowired
    private ITasasRepository vrtR;


    @Override
    public void insert(Tasas tasas) {
        vrtR.save(tasas);
    }

    @Override
    public List<Tasas> vrlist() {
        return vrtR.findAll();
    }

    @Override
    public void delete(int IdTasa) {
        vrtR.deleteById(IdTasa);
    }

    @Override
    public Tasas listId(int IdTasa) {
        return vrtR.findById(IdTasa).orElse(new Tasas());
    }
}
