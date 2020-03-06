package rest;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Stateless
@Path("default")
public class DefaultService {
	
	@GET
	@Path("getHealth")
	public String getHealthCheck() {
		return "Servier is online and breathing";
	}
	
	@GET
	@Path("echo")
	public Response getEchoMsg(@QueryParam("message") String msg) {
		return Response.ok("Your message was " + msg).build();
	}
	
	@GET
	@Path("object")
	@Produces(MediaType.APPLICATION_JSON)
	public SimpleObject getObject() {
		return new SimpleObject(1, "Test");
	}
}
