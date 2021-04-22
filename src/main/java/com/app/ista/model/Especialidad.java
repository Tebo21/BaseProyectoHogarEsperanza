package com.app.ista.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//lombok anotation
@Data
//Spring create a collection in MongoDB 
@Document(collection = "especialidad")
public class Especialidad {
	
	@Id
	private String idEspecialidad;
	private String nombreEspecialidad;
	private String idCentroMedico;

}
