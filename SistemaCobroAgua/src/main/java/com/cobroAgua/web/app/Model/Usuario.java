package com.cobroAgua.web.app.Model;

import java.io.Serializable;

public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int user_n;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	
	public int getUser_n() {
		return user_n;
	}
	public void setUser_n(int user_n) {
		this.user_n = user_n;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApPaterno() {
		return apPaterno;
	}
	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}
	public String getApMaterno() {
		return apMaterno;
	}
	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

}
