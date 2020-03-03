package rest;

import javax.faces.bean.ApplicationScoped;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.annotation.ManagedBean;

@ApplicationScoped
@ManagedBean
public class RestClient {

	public void call() {
		Client client = ClientBuilder.newClient();
		
		SimpleObject o = client.target("http://localhost:8080/RestExampe/api/rest/object").request().get(SimpleObject.class);
		
		System.out.println(o);
	}
}
 