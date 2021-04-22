package com.app.ista.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//lombok anotation
@Data
//Spring create a colection in MongoDB 
@Document(collection = "donaciones")
public class Donaciones {
	@Id
	private String idDonacion;
	private String nombreDonacion;
	private int cantidad;
	private List<String> categoria;
	private Date fechaDonacion;
	private String descripcionDonacion;
	private String cedulaPersona;

}
