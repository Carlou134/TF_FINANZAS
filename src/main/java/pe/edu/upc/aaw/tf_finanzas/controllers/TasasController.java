package pe.edu.upc.aaw.tf_finanzas.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.tf_finanzas.dtos.TasasDTO;
import pe.edu.upc.aaw.tf_finanzas.entities.Tasas;
import pe.edu.upc.aaw.tf_finanzas.servicesinterfaces.ITasasService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tasas")
public class TasasController {
    @Autowired
    private ITasasService vrTs;

    @PostMapping
    public void registrar(@RequestBody TasasDTO vrdto) {
        ModelMapper vrm = new ModelMapper();
        Tasas vrc = vrm.map(vrdto, Tasas.class);
        vrTs.insert(vrc);
    }

    @GetMapping
    public List<TasasDTO> listar() {
        return vrTs.vrlist().stream().map(x->{
            ModelMapper vrm=new ModelMapper();
            return vrm.map(x,TasasDTO.class);
        }).collect(Collectors.toList());
    }
}
