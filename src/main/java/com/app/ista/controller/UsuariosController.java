package com.app.ista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ista.model.Persona;
import com.app.ista.model.Usuarios;
import com.app.ista.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*")
public class UsuariosController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping
    public ResponseEntity<String> guardarUsuario(@RequestBody Usuarios usuario) {
		usuarioService.guardarUsuario(usuario);
        return ResponseEntity.ok("OK");
    }

}
