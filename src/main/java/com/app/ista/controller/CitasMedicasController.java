package com.app.ista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ista.model.CitasMedicas;
import com.app.ista.service.CitasMedicasService;

@RestController
@RequestMapping("/citasMedicas")
@CrossOrigin(origins = "*")
public class CitasMedicasController {
	
	@Autowired
	CitasMedicasService citasMedicasService;
	
	@PostMapping
    public ResponseEntity<String> guardarCitaMedica(@RequestBody CitasMedicas citasMedicas) {
		citasMedicasService.guardarCitaMedica(citasMedicas);
        return ResponseEntity.ok("OK");
    }

}
