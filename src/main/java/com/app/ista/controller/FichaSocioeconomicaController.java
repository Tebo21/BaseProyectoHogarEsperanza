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

import com.app.ista.model.FichaSocioeconomica;
import com.app.ista.service.FichaSocioeconomicaService;

@RestController
@RequestMapping("/fichaSocioeconomica")
@CrossOrigin(origins = "*")
public class FichaSocioeconomicaController {
	
	@Autowired
	FichaSocioeconomicaService fichaSocioeconomicaService;
	
	@PostMapping(value = "/addfichaSocioeconomica")
	public ResponseEntity<String> guardarFichaSocioeconomica(@RequestBody FichaSocioeconomica fichaSocioeconomica) {
		fichaSocioeconomicaService.guardarFichaSocioeconomica(fichaSocioeconomica);
        return ResponseEntity.ok("OK");
    }
	
	@GetMapping(path = "/listadoFichas", produces = "application/json")
	public List<FichaSocioeconomica>listarFichas(){
		return fichaSocioeconomicaService.listarFichas();
	}
}
