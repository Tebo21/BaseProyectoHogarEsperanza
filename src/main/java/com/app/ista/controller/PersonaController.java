package com.app.ista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ista.model.Persona;
import com.app.ista.service.PersonaService;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "*")
public class PersonaController {

	@Autowired
    PersonaService personaService;
	
	@PostMapping
    public ResponseEntity<String> guardarPersona(@RequestBody Persona persona) {
        personaService.guardarPersona(persona);
        return ResponseEntity.ok("OK");
    }
}


