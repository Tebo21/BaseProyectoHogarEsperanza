package com.app.ista.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.ista.model.Persona;
import com.app.ista.service.PersonaService;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "*")
public class PersonaController {

	@Autowired
	PersonaService personaService;

	@PostMapping(value = "/crearPersona")
	public ResponseEntity<String> guardarPersona(@RequestBody Persona persona) {
		personaService.guardarPersona(persona);
		return ResponseEntity.ok("OK");
	}

	@GetMapping(path = "/listadoPersonas", produces = "application/json")
	public List<Persona> listarPersonas() {
		return personaService.listarPersonas();
	}

	@GetMapping(path = "/listarPorCorreo", produces = "application/json")
	public Persona recuperarPorCorreo(@RequestParam("correoPersona") String correoPersona ){
		return personaService.recuperarPorCorreo(correoPersona);
	}

	@GetMapping(path = "/bycedula/{cedula}", produces = "application/json")
	public Persona porCedula(@PathVariable String cedula) {
		return personaService.porCedula(cedula);
	}
	
	@DeleteMapping("delete-persona/{cedula}")
	public void eliminarPersona(@PathVariable String cedula){
		personaService.eliminarPersona(cedula);
	}
	
	
	@PutMapping("/update-persona")
	public Persona actualizarPersona(@RequestBody Persona persona) {
		Persona per= personaService.porCedula(persona.getCedula());
		per.setNombres(persona.getNombres());
		per.setApellidos(persona.getApellidos());
		per.setDireccion(persona.getDireccion());
		per.setCelular(persona.getCelular());
		per.setCorreo(persona.getCorreo());
		per.setGenero(persona.getGenero());
		per.setFechaNacimiento(persona.getFechaNacimiento());
		per.setEdad(persona.getEdad());
		per.setNacionalidad(persona.getNacionalidad());
		per.setDiscapacidad(persona.isDiscapacidad());
		per.setEstado_civil(persona.getEstado_civil());
		per.setBeneficiario(persona.isBeneficiario());
		per.setEstadoActivo(persona.isEstadoActivo());
		personaService.guardarPersona(per);
		return per;
	}
	
	@GetMapping(path = "/listadoBeneficiariosActivos", produces = "application/json")
	public List<Persona> listarPorEstadoYTipo(@RequestParam boolean estadoActivo, @RequestParam boolean beneficiario) {
		return personaService.findByEstadoAndBeneficiario(estadoActivo, beneficiario);
	}
	
}
