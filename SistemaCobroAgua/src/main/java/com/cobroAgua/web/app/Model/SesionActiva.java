package com.cobroAgua.web.app.Model;

import java.io.Serializable;

public class SesionActiva implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int user_n;
	private String rol_n;
	private String rol_l;
	private String est_n;
	private String est_l;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	
	public int getUser_n() {
		return user_n;
	}
	public void setUser_n(int user_n) {
		this.user_n = user_n;
	}
	public String getRol_n() {
		return rol_n;
	}
	public void setRol_n(String rol_n) {
		this.rol_n = rol_n;
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
	public String getEst_n() {
		return est_n;
	}
	public void setEst_n(String est_n) {
		this.est_n = est_n;
	}
	public String getEst_l() {
		return est_l;
	}
	public void setEst_l(String est_l) {
		this.est_l = est_l;
	}
	public String getRol_l() {
		return rol_l;
	}
	public void setRol_l(String rol_l) {
		this.rol_l = rol_l;
	}
}
