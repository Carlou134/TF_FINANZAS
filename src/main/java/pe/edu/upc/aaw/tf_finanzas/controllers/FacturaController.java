package pe.edu.upc.aaw.tf_finanzas.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.tf_finanzas.dtos.FacturasDTO;
import pe.edu.upc.aaw.tf_finanzas.entities.Facturas;
import pe.edu.upc.aaw.tf_finanzas.servicesinterfaces.IFacturasService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/facturas")
public class FacturaController {
    @Autowired
    private IFacturasService vrfs;

    @PostMapping
    public void registrar(@RequestBody FacturasDTO vrdto) {
        ModelMapper vrm = new ModelMapper();
        Facturas vrc = vrm.map(vrdto, Facturas.class);
        vrfs.insert(vrc);
    }

    @GetMapping
    public List<FacturasDTO> listar() {
        return vrfs.vrlist().stream().map(x->{
            ModelMapper vrm=new ModelMapper();
            return vrm.map(x,FacturasDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        vrfs.delete(id);
    }

    @GetMapping("/{id}")
    public FacturasDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        FacturasDTO dto = m.map(vrfs.listId(id),FacturasDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody FacturasDTO dto){
        ModelMapper m = new ModelMapper();
        Facturas t = m.map(dto, Facturas.class);
        vrfs.insert(t);
    }
}
