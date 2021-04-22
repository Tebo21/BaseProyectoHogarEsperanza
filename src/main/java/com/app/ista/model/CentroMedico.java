package com.app.ista.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//lombok anotation
@Data
//Spring create a collection in MongoDB 
@Document(collection = "centroMedico")
public class CentroMedico {
	
	@Id
	private String idCentroMedico;
	private String nombreCentroMedico;
	private String direccionCentroMedico;
	private String telefonoCentroMedico;

}
