package com.zone.ws.services;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import com.zone.ws.vo.VOUsuario;

public class RestClient {
	
	public static void main(String [] args){
		
		String urlRestService ="http://localhost:8080/firstWS/rest/ZoneRest/validaUser";
		VOUsuario usu = new VOUsuario();
		usu.setUsuario("ces");
		usu.setPass("gfgd");
		usu.setUservalido(false);
		
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		Client client=Client.create(clientConfig);
		
		WebResource webResource = client.resource(urlRestService);
		ClientResponse response= webResource.type("application/json").post(ClientResponse.class,usu);
		usu=response.getEntity(VOUsuario.class);
		
		System.out.println("Respuesta "+usu.getUsuario());
		System.out.println("Respuesta "+usu.isUservalido());
		
		
		
		
	}

}
