package com.app.ista.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Spring create a colection in MongoDB 
@Document(collection = "registroFamiliares")
public class RegistroFamliares {
	@Id
	private int idRegistroFamiliares;
	private String cedulaPersona;
	private int numHijos;
	private List<String> hijos;
	
	public RegistroFamliares(int idRegistroFamiliares, String cedulaPersona, int numHijos, List<String> hijos) {
		this.idRegistroFamiliares = idRegistroFamiliares;
		this.cedulaPersona = cedulaPersona;
		this.numHijos = numHijos;
		this.hijos = hijos;
	}

	public int getIdRegistroFamiliares() {
		return idRegistroFamiliares;
	}

	public void setIdRegistroFamiliares(int idRegistroFamiliares) {
		this.idRegistroFamiliares = idRegistroFamiliares;
	}

	public String getCedulaPersona() {
		return cedulaPersona;
	}

	public void setCedulaPersona(String cedulaPersona) {
		this.cedulaPersona = cedulaPersona;
	}

	public int getNumHijos() {
		return numHijos;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}

	public List<String> getHijos() {
		return hijos;
	}

	public void setHijos(List<String> hijos) {
		this.hijos = hijos;
	}
	
}
