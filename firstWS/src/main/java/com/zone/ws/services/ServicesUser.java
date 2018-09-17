package com.zone.ws.services;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.zone.ws.dao.DUser;
import com.zone.ws.vo.VOUsuario;

@Path("/user")
public class ServicesUser {
	
	DUser modelo = new DUser();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getLista (){
		
		List<VOUsuario> lista = modelo.listar();
		return Response.ok(lista).build();
	}
}
