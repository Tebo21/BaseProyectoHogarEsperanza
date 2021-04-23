package com.app.ista.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.ista.model.Usuarios;


@Repository
public interface UsuariosRepository extends MongoRepository<Usuarios, Long>{
	
	@Query(value = "{},{idUsuario:1}", sort = "{_id: -1}")
    List<Usuarios> id();

}
