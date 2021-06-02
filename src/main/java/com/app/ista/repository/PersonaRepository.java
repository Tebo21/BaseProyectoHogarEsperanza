package com.app.ista.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.app.ista.model.Persona;

@Repository
public interface PersonaRepository extends MongoRepository<Persona, String>{
	Persona findByCorreo(String correo);

	Persona findByCedula(String cedula);
}
