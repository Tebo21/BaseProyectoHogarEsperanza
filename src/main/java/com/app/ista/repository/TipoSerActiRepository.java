package com.app.ista.repository;

import java.util.List;

import com.app.ista.model.TipoServicio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoSerActiRepository extends MongoRepository<TipoServicio, Integer>{
    
    @Query(value = "{},{idTipoActividad:1}", sort = "{_id: -1}")
    List<TipoServicio> id();

    TipoServicio findByNombreActividad(String nombreActividad);

    TipoServicio findByIdTipoActividad(int idTipoActividad);
}
