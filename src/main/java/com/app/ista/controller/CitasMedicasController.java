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

import com.app.ista.model.CitasMedicas;
import com.app.ista.service.CitasMedicasService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/citasMedicas")
@CrossOrigin(origins = "http://localhost:4200")
public class CitasMedicasController {
	
	@Autowired
	CitasMedicasService citasMedicasService;
	
	@PostMapping(path = "/guardar")
	public ResponseEntity<String> guardarCentroMedico(@RequestBody CitasMedicas citasMedicas) {
		citasMedicasService.guardarCitaMedica(citasMedicas);
        return ResponseEntity.ok("Guardado Correctamente");
    }

	@GetMapping(path = "/listar", produces = "application/json")
	public List<CitasMedicas>listCitasMedicas(){
		return citasMedicasService.listarCitasMedicas();
	}

	@DeleteMapping(path = "/eliminar")
	public void deleteByIdCistasMe(@PathVariable (name = "citaMedica") Long citaMedica){
		citasMedicasService.eliminarCitaMedica(citaMedica);
	}
}
