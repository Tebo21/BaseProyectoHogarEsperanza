package com.app.ista.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//lombok anotation
@Data
//Spring create a collection in MongoDB 
@Document(collection = "agendamientoActividad")
public class AgendamientoActividad {

	@Id
	private String agendamientoActividad;
	private Date fechaRegistro;
	private Date fechaActividad;
	private String descripcionActividad;
	private Persona trabajadorEncargado;
	private Persona trabajadorAgendador;
	private String notas;
	
	
}
