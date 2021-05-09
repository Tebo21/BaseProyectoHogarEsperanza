package com.app.ista.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.ista.model.Usuarios;
import com.app.ista.service.PersonaService;
import com.app.ista.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*")
public class UsuariosController {

	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	PersonaService personaservice;
		
	@PostMapping
	public ResponseEntity<String> guardarUsuario(@RequestBody Usuarios usuario) {		
		String correo = usuario.getCorreoPersona();
		if (personaservice.recuperarPorCorreo(correo) != null) {
			usuarioService.guardarUsuario(usuario);
			return ResponseEntity.ok("OK");
		} else {
			return new ResponseEntity<>("No existe un usuario registrado con ese correo", HttpStatus.BAD_REQUEST);
		}

	}
	
	@GetMapping(path = "/listadoUsuarios", produces = "application/json")
	public List<Usuarios> listarUsuarios() {
		return usuarioService.listarUsuarios();
	}

	@GetMapping(path = "/login", produces = "application/json")
	public Usuarios login(@RequestParam("nombreUsuario") String nombreUsuario,
			@RequestParam("contrasenia") String contrasenia) {
		Usuarios usuario = usuarioService.iniciarSesion(nombreUsuario, contrasenia);
		if (usuario != null) {
			return usuario;
		}
		return new Usuarios();
	}
}
