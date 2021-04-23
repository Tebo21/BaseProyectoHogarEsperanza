package com.app.ista.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ista.model.CentroMedico;
import com.app.ista.service.CentroMedicoService;

@RestController
@RequestMapping("/centroMedico")
@CrossOrigin(origins = "*")
public class CentroMedicoController {
	
	@Autowired
	CentroMedicoService centroMedicoService;
	
	@PostMapping
	public ResponseEntity<String> guardarCentroMedico(@RequestBody CentroMedico centroMedico) {
		centroMedicoService.guardarCentroMedico(centroMedico);
        return ResponseEntity.ok("OK");
    }
	@GetMapping(path = "/listadoCentroMedico", produces = "application/json")
	public List<CentroMedico>listarCentroMedico(){
		return centroMedicoService.listarCentroMedico();
	}
}
