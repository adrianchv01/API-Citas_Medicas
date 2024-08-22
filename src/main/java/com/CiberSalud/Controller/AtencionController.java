package com.CiberSalud.Controller;

import com.CiberSalud.Service.AtencionService;
import com.CiberSalud.model.Atencion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/atenciones")
public class AtencionController {

    @Autowired
    private AtencionService servicio;

    @GetMapping
    public List<Atencion> listarAtencion(){
        return servicio.ListarAtencion();
    }

    @PostMapping
    public Atencion grabarAtencion(@RequestBody Atencion atencion){
        return servicio.RegistroAtencion(atencion);
    }

    @GetMapping("/{id}")
    public Optional<Atencion> buscarAtencion(@PathVariable int id){
        return servicio.BuscarAtencion(id);
    }




}
