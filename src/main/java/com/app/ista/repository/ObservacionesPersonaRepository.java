package com.app.ista.repository;

import com.app.ista.model.ObservacionesPersona;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ObservacionesPersonaRepository extends MongoRepository<ObservacionesPersona, Long>{
    @Query(value = "{},{idObservacionesPersona:1}", sort = "{_id: -1}")
    List<ObservacionesPersona> id();
    List<ObservacionesPersona> findByCedulaPersona(String cedulaPersona);
    ObservacionesPersona findByIdObservacionesPersona(int id);
}
