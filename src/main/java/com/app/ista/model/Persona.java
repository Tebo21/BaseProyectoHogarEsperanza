package com.app.ista.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//Spring create a collection in MongoDB 
@Document(collection = "persona")
public class Persona {

	@Id
	private String cedula;
	private String nombres;
	private String apellidos;
	private String direccion;
	private String celular;
	private String correo;
	private String genero;
	private Date fechaNacimiento;
	private int edad;
	private String tipoPersona;
	
	public Persona(String cedula, String nombres, String apellidos, String direccion, String celular, String correo,
			String genero, Date fechaNacimiento, int edad, String tipoPersona) {
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.celular = celular;
		this.correo = correo;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.tipoPersona = tipoPersona;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}
	
	
	
}
