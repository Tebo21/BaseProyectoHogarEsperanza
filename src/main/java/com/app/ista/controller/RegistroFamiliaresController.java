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

import com.app.ista.model.RegistroFamliares;
import com.app.ista.service.RegistroFamiliaresService;

@RestController
@RequestMapping("/registroFamiliares")
@CrossOrigin(origins = "*")
public class RegistroFamiliaresController {
	@Autowired
	RegistroFamiliaresService regisfamser;
	
	@PostMapping(value = "/addfamiliares")
    public ResponseEntity<String> guardarRegistroFamiliares(@RequestBody RegistroFamliares registrofamiliares) {
		regisfamser.guardarRegistroFamiliares(registrofamiliares);
        return ResponseEntity.ok("OK");
    }
	
	@GetMapping(path = "/listadoRegistroFamiliares", produces = "application/json")
	public List<RegistroFamliares>listadoRegistroFamiliares(){
		return regisfamser.listadoRegistroFamiliares();
	}
	@GetMapping(path = "/bycedula/{cedula}", produces = "application/json")
	public RegistroFamliares porCedula(@PathVariable String cedula) {
		return regisfamser.porCedula(cedula);
	}
	@PutMapping("/update-familiares")
	public RegistroFamliares actualizarFamiliares(@RequestBody RegistroFamliares registroFamliares){
		RegistroFamliares registroFam = regisfamser.porCedula(registroFamliares.getCedulaPersona());
		registroFam.setNumHijos(registroFamliares.getNumHijos());
		registroFam.setHijos(registroFamliares.getHijos());
		regisfamser.guardar(registroFam);
		return registroFam;
	}
}
