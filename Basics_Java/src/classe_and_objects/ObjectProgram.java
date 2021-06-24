package classe_and_objects;

import com.google.gson.Gson;

public class ObjectProgram {
	
	// Turn Object into JSON 
	// https://www.javatpoint.com/convert-java-object-to-json
	
	public static void notmain(String[] args) {
		
		SuccessResponse sr = new SuccessResponse();
		sr.setResponseCode(200);
		sr.setBody("{ response: something}");
		
		System.out.println(new Gson().toJson(sr));
	}
}
