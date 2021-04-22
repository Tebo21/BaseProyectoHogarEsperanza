package com.app.ista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ista.model.ActividadPersona;
import com.app.ista.model.Persona;
import com.app.ista.service.ActividadPersonaService;

@RestController
@RequestMapping("/actividadPersona")
@CrossOrigin(origins = "*")
public class ActividadPersonaController {

		@Autowired
		ActividadPersonaService actividadPersonaService;
		
		@PostMapping
	    public ResponseEntity<String> guardarActividadPersona(@RequestBody ActividadPersona actividadPersona) {
			actividadPersonaService.guardarActividadPersona(actividadPersona);
	        return ResponseEntity.ok("OK");
	    }
	
}
