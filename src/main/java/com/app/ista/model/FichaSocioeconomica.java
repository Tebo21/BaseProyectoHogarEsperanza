package com.app.ista.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Spring create a collection in MongoDB 
@Document(collection = "fichaSocioeconomica")
public class FichaSocioeconomica {
	@Id
	private int idFichaSocioeconomica;
	private String cedulaPersona;
	private String situacionEconomica;
	private String tipoVivienda;
	private String descripcionVivienda;
	private String seguro;
	private String discapacidad;
	private String discapacidadDescipcion;
	private String nacionalidad;
	private String estadoCivil;
	private double salario;
	private Date fechaRegistro;
	private boolean adultoMayor;
	private boolean viveConOtros;


	public FichaSocioeconomica() {
	}


	public int getIdFichaSocioeconomica() {
		return idFichaSocioeconomica;
	}


	public void setIdFichaSocioeconomica(int idFichaSocioeconomica) {
		this.idFichaSocioeconomica = idFichaSocioeconomica;
	}


	public String getCedulaPersona() {
		return cedulaPersona;
	}


	public void setCedulaPersona(String cedulaPersona) {
		this.cedulaPersona = cedulaPersona;
	}


	public String getSituacionEconomica() {
		return situacionEconomica;
	}


	public void setSituacionEconomica(String situacionEconomica) {
		this.situacionEconomica = situacionEconomica;
	}


	public String getTipoVivienda() {
		return tipoVivienda;
	}


	public void setTipoVivienda(String tipoVivienda) {
		this.tipoVivienda = tipoVivienda;
	}


	public String getDescripcionVivienda() {
		return descripcionVivienda;
	}


	public void setDescripcionVivienda(String descripcionVivienda) {
		this.descripcionVivienda = descripcionVivienda;
	}


	public String getSeguro() {
		return seguro;
	}


	public void setSeguro(String seguro) {
		this.seguro = seguro;
	}


	public String getDiscapacidad() {
		return discapacidad;
	}


	public void setDiscapacidad(String discapacidad) {
		this.discapacidad = discapacidad;
	}


	public String getDiscapacidadDescipcion() {
		return discapacidadDescipcion;
	}


	public void setDiscapacidadDescipcion(String discapacidadDescipcion) {
		this.discapacidadDescipcion = discapacidadDescipcion;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public String getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public Date getFechaRegistro() {
		return fechaRegistro;
	}


	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}


	public boolean isAdultoMayor() {
		return adultoMayor;
	}


	public void setAdultoMayor(boolean adultoMayor) {
		this.adultoMayor = adultoMayor;
	}


	public boolean isViveConOtros() {
		return viveConOtros;
	}


	public void setViveConOtros(boolean viveConOtros) {
		this.viveConOtros = viveConOtros;
	}

	

}
