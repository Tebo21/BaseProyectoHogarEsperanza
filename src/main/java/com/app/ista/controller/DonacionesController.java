package com.app.ista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	
	@PostMapping
    public ResponseEntity<String> guardarDonacion(@RequestBody Donaciones donaciones) {
		donacserv.guardarDonacion(donaciones);
        return ResponseEntity.ok("OK");
    }

}
