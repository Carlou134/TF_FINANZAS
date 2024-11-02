package pe.edu.upc.aaw.tf_finanzas.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.tf_finanzas.dtos.CarteraDTO;
import pe.edu.upc.aaw.tf_finanzas.entities.Cartera;
import pe.edu.upc.aaw.tf_finanzas.servicesinterfaces.ICarteraService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cartera")
public class CarteraController {
    @Autowired
    private ICarteraService vrCs;

    @PostMapping
    public void registrar(@RequestBody CarteraDTO vrdto) {
        ModelMapper vrm = new ModelMapper();
        Cartera vrc = vrm.map(vrdto, Cartera.class);
        vrCs.insert(vrc);
    }

    @GetMapping
    public List<CarteraDTO> listar() {
        return vrCs.vrlist().stream().map(x->{
            ModelMapper vrm=new ModelMapper();
            return vrm.map(x,CarteraDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        vrCs.delete(id);
    }

    @GetMapping("/{id}")
    public CarteraDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        CarteraDTO dto = m.map(vrCs.listId(id),CarteraDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody CarteraDTO dto){
        ModelMapper m = new ModelMapper();
        Cartera t = m.map(dto, Cartera.class);
        vrCs.insert(t);
    }

    @GetMapping("/listar/{userId}")
    public List<CarteraDTO> listarPorUsuarios(@PathVariable("userId") int userId) {
        return vrCs.findCarteraByIdUser(userId).stream().map(x->{
            ModelMapper vrm=new ModelMapper();
            return vrm.map(x,CarteraDTO.class);
        }).collect(Collectors.toList());
    }
}
