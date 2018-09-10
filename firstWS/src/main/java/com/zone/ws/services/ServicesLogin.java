package com.zone.ws.services;



import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.zone.ws.vo.VOUsuario;

@Path("/ZoneRest")
public class ServicesLogin {
	
	@POST
	@Path("/validaUser")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOUsuario validaUsuario(VOUsuario ousuario){
		ousuario.setUservalido(false);
		if(ousuario.getUsuario().equals("ces") && ousuario.getPass().equals("ces")){
			ousuario.setUservalido(true);
		}
		return ousuario;
	}
	
	
}
