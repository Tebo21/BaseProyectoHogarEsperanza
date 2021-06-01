package com.app.ista.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Spring create a collection in MongoDB 
@Document(collection = "usuarios")
public class Usuarios {
	
	@Id
	private int idUsuario;
	
	private String usuarioCedula;
	private String usuarioNombre;
	private String usuarioContrasenia;
	private String usuarioEmail;
	private int usuarioTipo;
	 
	public Usuarios() {	}

	public Usuarios(int idUsuario, String usuarioCedula, String usuarioNombre, String usuarioContrasenia,
			String usuarioEmail, int usuarioTipo) {
		this.idUsuario = idUsuario;
		this.usuarioCedula = usuarioCedula;
		this.usuarioNombre = usuarioNombre;
		this.usuarioContrasenia = usuarioContrasenia;
		this.usuarioEmail = usuarioEmail;
		this.usuarioTipo = usuarioTipo;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuarioCedula() {
		return usuarioCedula;
	}

	public void setUsuarioCedula(String usuarioCedula) {
		this.usuarioCedula = usuarioCedula;
	}

	public String getUsuarioNombre() {
		return usuarioNombre;
	}

	public void setUsuarioNombre(String usuarioNombre) {
		this.usuarioNombre = usuarioNombre;
	}

	public String getUsuarioContrasenia() {
		return usuarioContrasenia;
	}

	public void setUsuarioContrasenia(String usuarioContrasenia) {
		this.usuarioContrasenia = usuarioContrasenia;
	}

	public String getUsuarioEmail() {
		return usuarioEmail;
	}

	public void setUsuarioEmail(String usuarioEmail) {
		this.usuarioEmail = usuarioEmail;
	}

	public int getUsuarioTipo() {
		return usuarioTipo;
	}

	public void setUsuarioTipo(int usuarioTipo) {
		this.usuarioTipo = usuarioTipo;
	}

}