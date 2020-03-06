package com.appdev.cic.RestAPI.rest;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

@Stateless
@Path("/healthCheck")
public class HealthCheckService {
	
	@GET
	public Response getHealthCheck() {
		ResponseBuilder builder = Response.status(Status.OK);
		return builder.build();
	}

}
