package com.app.ista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ista.model.Especialidad;
import com.app.ista.service.EspecialidadService;

@RestController
@RequestMapping("/especialidad")
@CrossOrigin(origins = "*")
public class EspecialidadController {
	@Autowired
	EspecialidadService espeser;
	
	@PostMapping
    public ResponseEntity<String> guardarEspecialidad(@RequestBody Especialidad especialidad) {
		espeser.guardarEspecialidad(especialidad);
        return ResponseEntity.ok("OK");
    }
}
