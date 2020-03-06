package rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;


@ApplicationPath("/ide")
public class Service extends Application { 

	@Path("/hello")
	public class HelloResource {
	
	  @GET
	  @Path("hello")
	  public String helloworld() {
	      return "Hello World!";
	  }
	}
}