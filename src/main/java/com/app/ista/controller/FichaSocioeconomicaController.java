package com.app.ista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ista.model.FichaSocioeconomica;
import com.app.ista.service.FichaSocioeconomicaService;

@RestController
@RequestMapping("/fichaSocioeconomica")
@CrossOrigin(origins = "*")
public class FichaSocioeconomicaController {
	
	@Autowired
	FichaSocioeconomicaService fichaSocioeconomicaService;
	
	@PostMapping
	public ResponseEntity<String> guardarFichaSocioeconomica(@RequestBody FichaSocioeconomica fichaSocioeconomica) {
		fichaSocioeconomicaService.guardarFichaSocioeconomica(fichaSocioeconomica);
        return ResponseEntity.ok("OK");
    }

}
