package com.zone.ws.services;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sun.jersey.spi.resource.PerRequest;
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
	
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response getUser (@PathParam("id") int id){
		//Integer ids =id;
		VOUsuario user = modelo.buscar(id);
		return Response.ok(user).build();
	}
	
	
	@POST
	@Path("add")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response add (VOUsuario usuario){
		modelo.agregar(usuario);
		return Response.status(Response.Status.CREATED).entity(usuario).build();
	}
	
	
	
	
}
