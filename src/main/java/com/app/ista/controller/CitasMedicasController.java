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
        public CitasMedicas guardarCitaMedica(@RequestBody CitasMedicas citasMedicas) {
		citasMedicasService.guardarCita(citasMedicas);
        return citasMedicas;
        }

	@GetMapping(path = "/listar", produces = "application/json")
	public List<CitasMedicas>listCitasMedicas(){
		return citasMedicasService.listarCita();
	}

	@DeleteMapping(path = "/eliminar/{idCitaMedica}")
	public void deleteByIdCistasMe(@PathVariable (name = "idCitaMedica") Long citaMedica){
		citasMedicasService.eliminarCita(citaMedica);
	}
}
