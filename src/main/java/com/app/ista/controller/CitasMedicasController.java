package com.app.ista.controller;

import com.app.ista.model.CentroMedico;

import java.util.Date;
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
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

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
	public List<CitasMedicas> listCitasMedicas() {
		return citasMedicasService.listarCita();
	}

	@GetMapping(path = "/listadoId/{citasMedicasId}", produces = "application/json")
	public Optional<CitasMedicas> listarCitasId(Long idCitas) {
		return citasMedicasService.listarCitasId(idCitas);
	}

	@DeleteMapping(path = "/eliminar/{idCitaMedica}")
	public void deleteByIdCistasMe(@PathVariable(name = "idCitaMedica") Long citaMedica) {
		citasMedicasService.eliminarCita(citaMedica);
	}

	@PutMapping(path = "/editar/{citasMedicasId}")
	public CitasMedicas modificarCita(@RequestBody CitasMedicas citadG,
			@PathVariable(name = "citasMedicasId") Long citaId) {
		CitasMedicas cit = citasMedicasService.listarCitasId(citaId).get();
		cit.setDescripcionCitaMedica(citadG.getDescripcionCitaMedica());
		cit.setFechaRegistro(citadG.getFechaCitaMedica());
		cit.setFechaCitaMedica(citadG.getFechaCitaMedica());
		cit.setPaciente(citadG.getPaciente());
		cit.setAcompaniante(citadG.getAcompaniante());
		cit.setMensaje(citadG.getMensaje());
		cit.setTrabajadorFundacion(citadG.getTrabajadorFundacion());
		cit.setCentroMedico(citadG.getCentroMedico());
		cit.setEspecialidad(citadG.getEspecialidad());
		cit.setNota(citadG.getNota());
		citasMedicasService.editarCitas(citaId, cit);
		return cit;
	}

	@GetMapping(path = "/fecha/{fechaCita}", produces = "application/json")
	public List<CitasMedicas> listarFecha(Date fechacita) {
		return citasMedicasService.listarFecha(fechacita);
	}
}
