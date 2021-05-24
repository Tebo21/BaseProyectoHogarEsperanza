package com.app.ista.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.ista.model.Persona;
import com.app.ista.service.PersonaService;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "*")
public class PersonaController {

	@Autowired
	PersonaService personaService;

	@PostMapping(value = "/creadPerosna")
	public ResponseEntity<String> guardarPersona(@RequestBody Persona persona) {
		personaService.guardarPersona(persona);
		return ResponseEntity.ok("OK");
	}

	@GetMapping(path = "/listadoPersonas", produces = "application/json")
	public List<Persona> listarPersonas() {
		return personaService.listarPersonas();
	}

	@GetMapping(path = "/listarPorCorreo", produces = "application/json")
	public Persona recuperarPorCorreo(@RequestParam("correoPersona") String correoPersona ){
		return personaService.recuperarPorCorreo(correoPersona);
	}

}
