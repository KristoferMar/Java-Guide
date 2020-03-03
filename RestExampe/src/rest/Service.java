package rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


//Our default application path.
@ApplicationPath("/api")
public class Service extends Application {
	
	int testVariable = 0;

}