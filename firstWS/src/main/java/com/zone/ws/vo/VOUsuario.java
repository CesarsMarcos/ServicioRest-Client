package com.zone.ws.vo;

import java.io.Serializable;

public class VOUsuario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1083341102755414278L;
	private Integer idUsuario;
	private String usuario;
	private String email;
	private String pass;
	private Integer estado;
	private Integer idPerfil;
	//private boolean uservalido;
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public Integer getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}
	@Override
	public String toString() {
		return "VOUsuario [idUsuario=" + idUsuario + ", usuario=" + usuario + ", email=" + email + ", pass=" + pass
				+ ", estado=" + estado + ", idPerfil=" + idPerfil + "]";
	}
	
	
	
	
	
	
	
	
}
