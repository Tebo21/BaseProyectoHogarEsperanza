package com.app.ista.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.ista.model.ActividadPersona;

@Repository
public interface ActividadPersonaRepository extends MongoRepository<ActividadPersona,Long> {

	@Query(value = "{},{idActividadPersona:1}", sort = "{_id: -1}")
    List<ActividadPersona> id();
    
}
