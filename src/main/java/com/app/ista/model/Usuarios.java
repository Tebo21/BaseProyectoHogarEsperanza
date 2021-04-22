package com.app.ista.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//Spring create a collection in MongoDB 
@Document(collection = "usuarios")
public class Usuarios {
	@Id
	private int idUsuario;
	private String nombreUsuario;
	private String contrasenia;
	private String correoPersona;
	private List<String> tipoUsuario;

	public Usuarios(int idUsuario, String nombreUsuario, String contrasenia, String correoPersona,
			List<String> tipoUsuario) {
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.contrasenia = contrasenia;
		this.correoPersona = correoPersona;
		this.tipoUsuario = tipoUsuario;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getCorreoPersona() {
		return correoPersona;
	}

	public void setCorreoPersona(String correoPersona) {
		this.correoPersona = correoPersona;
	}

	public List<String> getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(List<String> tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

}
