package com.app.ista.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.app.ista.model.CentroMedico;
import com.app.ista.service.CentroMedicoService;

//cambios
@RestController
@RequestMapping("/centroMedico")
@CrossOrigin(origins = "*")
public class CentroMedicoController {
	
	@Autowired
	CentroMedicoService centroMedicoService;
	
	@PostMapping(path = "/guardarCentroMedico")
	public ResponseEntity<String> guardarCentroMedico(@RequestBody CentroMedico centroMedico) {
		centroMedicoService.guardarCentroMedico(centroMedico);
        return ResponseEntity.ok("OK");
    }

	@GetMapping(path = "/listadoCentroMedico", produces = "application/json")
	public List<CentroMedico>listarCentroMedico(){
		return centroMedicoService.listarCentroMedico();
	}

	@GetMapping(path = "/listadoCentroMedicoId/{centroMedicoId}", produces = "application/json")
	public Optional<CentroMedico>listarCentroMedicoId(Long idCentro){
		return centroMedicoService.listarCentroId(idCentro);
	}	


	@DeleteMapping(path = "/eliminarCentroMedico/{centroMedicoId}")
	public void deleteByIdCentroMe(@PathVariable (name = "centroMedicoId") Long centroMedicoId){
		centroMedicoService.eliminarCentroMedico(centroMedicoId);
	}

	@PutMapping(path = "/editarCentroMedico/{centroMedicoId}")
	public ResponseEntity<String> modificarCentroMedico(@RequestBody CentroMedico centroMedico,
	@PathVariable(name = "centroMedicoId") Long centroMedId) {
		CentroMedico centro = centroMedicoService.listarCentroId(centroMedId).get();
		centro.setDireccionCentroMedico(centroMedico.getDireccionCentroMedico());
		centro.setNombreCentroMedico(centroMedico.getNombreCentroMedico());
		centro.setTelefonoCentroMedico(centroMedico.getTelefonoCentroMedico());
		return ResponseEntity.ok("OK");
    }
	
}
