package com.zone.ws.vo;

public class VOUsuario {

	private String usuario;
	private String pass;
	private boolean uservalido;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public boolean isUservalido() {
		return uservalido;
	}
	public void setUservalido(boolean uservalido) {
		this.uservalido = uservalido;
	}
	@Override
	public String toString() {
		return "VOUsuario [usuario=" + usuario + ", pass=" + pass + ", uservalido=" + uservalido + "]";
	} 
	
	
}
