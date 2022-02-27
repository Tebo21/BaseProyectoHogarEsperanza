package com.app.ista.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ista.model.ObservacionesPersona;
import com.app.ista.service.ObservacionesPersonaService;

@RestController
@RequestMapping("/observacionesPersonas")
@CrossOrigin(origins = "*")
public class ObservacionesPersonaController {
    @Autowired
    ObservacionesPersonaService observacionesPersonaService;

    @PostMapping(value = "/addobservacionesPersonas")
    public ResponseEntity<String> guardarObservacionesPersonas(@RequestBody ObservacionesPersona observacionesPersona){
        observacionesPersonaService.guardarObservacionesPersonas(observacionesPersona);
        return ResponseEntity.ok("OK");
    }
    
    @GetMapping(path = "/byCedulaObservaciones/{cedula}", produces = "application/json")
    public List<ObservacionesPersona> byCedulaObservaciones(@PathVariable String cedula){
        return observacionesPersonaService.listByCedula(cedula);
    }

    @PutMapping("/update-Observaciones")
    public ObservacionesPersona actualizarObservaciones(@RequestBody ObservacionesPersona observacionesPersona){
        ObservacionesPersona observacionesPersona2 = observacionesPersonaService.getporId(observacionesPersona.getIdObservacionesPersona());
        observacionesPersona2.setDescripcionobservacion(observacionesPersona.getDescripcionobservacion());
        observacionesPersonaService.guardar(observacionesPersona2);
        return observacionesPersona2;
    }
}

