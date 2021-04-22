package com.app.ista.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//lombok anotation
@Data
//Spring create a collection in MongoDB 
@Document(collection = "registroCalificacion")
public class RegistroCalificacion {
	
	@Id
	private String idRegistroCalificacion;
	private String calificacionEntrevistado;
	private String recomiendaAyuda;
	private String notas;
	private Date fechaEntrega;
	private FichaSocioeconomica fichaSocioEconomica;

}
