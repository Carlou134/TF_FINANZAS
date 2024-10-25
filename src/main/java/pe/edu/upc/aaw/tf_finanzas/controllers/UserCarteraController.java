package pe.edu.upc.aaw.tf_finanzas.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.tf_finanzas.dtos.UserCarteraDTO;
import pe.edu.upc.aaw.tf_finanzas.entities.UserCartera;
import pe.edu.upc.aaw.tf_finanzas.servicesinterfaces.IUserCarteraService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user-cartera")
public class UserCarteraController {
    @Autowired
    private IUserCarteraService rS;

    @PostMapping
    public void registrar(@RequestBody UserCarteraDTO dto) {
        ModelMapper m = new ModelMapper();
        UserCartera r = m.map(dto, UserCartera.class);
        rS.insert(r);
    }

    @PutMapping
    public void modificar(@RequestBody UserCarteraDTO dto) {
        ModelMapper m = new ModelMapper();
        UserCartera r = m.map(dto, UserCartera.class);
        rS.insert(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        rS.delete(id);
    }

    @GetMapping("/{id}")
    public UserCarteraDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        UserCarteraDTO dto = m.map(rS.listarId(id), UserCarteraDTO.class);
        return dto;
    }

    @GetMapping
    public List<UserCarteraDTO> listar() {
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UserCarteraDTO.class);
        }).collect(Collectors.toList());
    }
}
