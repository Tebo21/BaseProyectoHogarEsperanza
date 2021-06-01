package com.app.ista.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.ista.model.Usuarios;
import com.app.ista.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*")
public class UsuariosController {

	@Autowired
	UsuarioService usuarioService;
			
	@PostMapping("/post-usuario")
	public Usuarios guardarUsuario(@RequestBody Usuarios usuario) {	
		Usuarios usuariocreado = usuarioService.guardarUsuario(usuario);
		return usuariocreado;
	}
	
	@GetMapping("/getAll-usuario")
	public List<Usuarios> listarUsuarios() {
		return usuarioService.listarUsuarios();
	}

	@GetMapping("/login-usuario")
	public Usuarios login(@RequestParam("usuarioCedula") String usuarioCedula, @RequestParam("usuarioContrasenia") String usuarioContrasenia) {
		Usuarios usuario = usuarioService.iniciarSesion(usuarioCedula, usuarioContrasenia);
		if (usuario != null) {
			return usuario;
		}
		return new Usuarios();
	}
	
}
