package data_structures.map_interface;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapHeaders {
	
	public class HeadersDTO implements Serializable {

	    private HashMap<String, String> headerMap;

	    public void setHeaderMap(HashMap<String, String> headerMap) {
	        this.headerMap = headerMap;
	    }

	    public HashMap<String, String> getHeaderMap() {
	        return headerMap;
	    }

	}
	
	protected void forwardRequest() {
		// Create hashmap with values
	    HashMap<String, String> headers = new HashMap<String, String>();
	    headers.put("x-Rute-AfsenderOrganisation", "value");
	    headers.put("x-Rute-AfsenderItSystemInstans", "value");
	    headers.put("x-Rute-ModtagerOrganisation", "value");

		
	    // Set entry in HeadersDTO with the newly created hashmap
		HeadersDTO headerMap = new HeadersDTO();
		headerMap.setHeaderMap(headers);
				
		// Verify all all or none header values are pressent
	    if(VerifyKeyCombination(headerMap) != 3 && VerifyKeyCombination(headerMap) != 0)
	    {
	    	System.out.println("THIS IS BAD! - Return error response");
	    }

		// Loop through HeaderDTO and print out keys and values.
        for(Map.Entry<String, String> headerEntry : headerMap.getHeaderMap().entrySet()) {
            System.out.println(headerEntry.getKey() + " " + headerEntry.getValue());        	
        }
        
	}
	
	public static void main(String[] args) {
		MapHeaders mapheaders = new MapHeaders();
		mapheaders.forwardRequest();
	}
	
	// Verify a specific combination of headers is pressent
	private static Integer VerifyKeyCombination(HeadersDTO headerMap) {
	    
	    int headerCount = 0;

		// Loop through HeaderDTO and print out keys and values.
        for(Map.Entry<String, String> headerEntry : headerMap.getHeaderMap().entrySet()) {     
	        if(headerEntry.getKey().equals("x-Rute-ModtagerOrganisation") || headerEntry.getKey() == "x-Rute-AfsenderOrganisation" || headerEntry.getKey() == "x-Rute-AfsenderItSystemInstans") {
	        	headerCount++;
	        }
        }
	    	    	       
	    return headerCount;
	}
}
