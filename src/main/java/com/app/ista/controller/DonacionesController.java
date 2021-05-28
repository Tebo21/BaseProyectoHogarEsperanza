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

import com.app.ista.model.Donaciones;
import com.app.ista.service.DonacionesService;

@RestController
@RequestMapping("/donaciones")
@CrossOrigin(origins = "*")
public class DonacionesController {
	
	@Autowired
	DonacionesService donacserv;
	
	@PostMapping(path = "/", produces = "application/json")
    public Donaciones guardarDonacion(@RequestBody Donaciones donaciones) {
		return donacserv.guardarDonacion(donaciones);
        
    }

	@GetMapping(path = "/listadoDonaciones", produces = "application/json")
	public List<Donaciones>listadoDonaciones(){
		return donacserv.listadoDonaciones();
	}
}
