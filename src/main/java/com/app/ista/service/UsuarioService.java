package com.app.ista.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ista.model.Usuarios;
import com.app.ista.repository.UsuariosRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuariosRepository usuarioRepository;
	
	
	public Usuarios guardarUsuario(Usuarios usuario) {
		if (usuarioRepository.findAll().isEmpty()) {
			usuario.setIdUsuario(1);
        } else {
        	usuario.setIdUsuario(usuarioRepository.id().get(0).getIdUsuario()+ 1);
        }
        return usuarioRepository.save(usuario);
	}
}
