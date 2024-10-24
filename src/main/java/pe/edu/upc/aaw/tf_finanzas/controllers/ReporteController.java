package pe.edu.upc.aaw.tf_finanzas.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.tf_finanzas.dtos.ReporteDTO;
import pe.edu.upc.aaw.tf_finanzas.entities.Reporte;
import pe.edu.upc.aaw.tf_finanzas.servicesinterfaces.IReporteService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reportes")
public class ReporteController {
    @Autowired
    private IReporteService vrRs;

    @PostMapping
    public void registrar(@RequestBody ReporteDTO vrdto) {
        ModelMapper vrm = new ModelMapper();
        Reporte vrc = vrm.map(vrdto, Reporte.class);
        vrRs.insert(vrc);
    }

    @GetMapping
    public List<ReporteDTO> listar() {
        return vrRs.vrlist().stream().map(x->{
            ModelMapper vrm=new ModelMapper();
            return vrm.map(x,ReporteDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        vrRs.delete(id);
    }

    @GetMapping("/{id}")
    public ReporteDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        ReporteDTO dto = m.map(vrRs.listId(id),ReporteDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody ReporteDTO dto){
        ModelMapper m = new ModelMapper();
        Reporte t = m.map(dto, Reporte.class);
        vrRs.insert(t);
    }
}
