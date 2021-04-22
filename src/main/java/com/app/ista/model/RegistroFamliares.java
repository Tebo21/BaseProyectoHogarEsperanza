package com.app.ista.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//lombok anotation
@Data
//Spring create a colection in MongoDB 
@Document(collection = "registroFamiliares")
public class RegistroFamliares {
	@Id
	private String cedulaPersona;
	private int numHijos;
	private List<String> hijos;

}
