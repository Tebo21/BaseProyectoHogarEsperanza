package com.app.ista.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ista.model.Persona;
import com.app.ista.repository.PersonaRepository;

@Service
public class PersonaService {


	@Autowired
    private PersonaRepository personaRepository;
	
	public Persona guardarPersona(Persona persona) {
        return personaRepository.save(persona);
    }
	public List<Persona> listarPersonas() {
        return personaRepository.findAll();
    }
}
