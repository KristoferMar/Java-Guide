package com.appdev.cic.RestAPI.rest;

import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.appdev.cic.RestAPI.model.SKATErrorResponse;
import com.google.gson.Gson;

@Path("/objecttester")
@RequestScoped
public class ObjectTestService {
	
    @Inject
    private Logger log;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createMember() {
    	
    	System.out.println("im hit");
    	
    	String restaurantJson = "{\"meta\":{\"operationId\":\"8ff0da45-055c-4094-85db-f704b34b832b\"},\"errors\":[{\"type\":\"fejl\",\"kode\":\"403.8\",\"besked\":\"Aftale-id eksisterer ikke\",\"status\":\"403\"}]}";
    	System.out.println(restaurantJson);
    	
  
    	
    	return Response.ok().build();
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response ResponseObject() {
    	
    	System.out.println("im hit");
    	String restaurantJson = "{\"meta\":{\"operationId\":\"8ff0da45-055c-4094-85db-f704b34b832b\"},\"errors\":[{\"type\":\"fejl\",\"kode\":\"403.8\",\"besked\":\"Aftale-id eksisterer ikke\",\"status\":\"403\"}]}";
  
    	
    	return Response.status(200).entity(restaurantJson).build();
    }
}
