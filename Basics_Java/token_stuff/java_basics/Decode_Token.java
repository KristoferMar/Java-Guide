package java_basics;

import java.util.Base64;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Decode_Token {
	
	public static void main(String[] args) {
		deserializeToken("eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJkdkROUGJVSUFMR0ZkQUdFMmY1Slh5Z3VuMW5ZTjdRS2hVTzR4TkxZbHB3In0.eyJqdGkiOiI5MTc4ZjhlOC0xMDE4LTQ2YzEtODlkMS1jZjIwNWYyZmE2MjUiLCJleHAiOjE2MzQ3MjQ0NzEsIm5iZiI6MCwiaWF0IjoxNjM0NzI0NDExLCJpc3MiOiJodHRwczovL3NhbWwuYWRtaW4taWJtcHJlZXh0dGVzdC5zZXJ2aWNlcGxhdGZvcm1lbi5kay9hdXRoL3JlYWxtcy9hZG1pbmlzdHJhdGlvbiIsImF1ZCI6ImFkbWluaXN0cmF0aW9uIiwic3ViIjoiZTY5NDFkMmMtYTRkYS00NDI3LTg5MzAtOWVmNWQ0NzUwNjc0IiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiYWRtaW5pc3RyYXRpb24iLCJhdXRoX3RpbWUiOjE2MzQ3MjQ0MTEsInNlc3Npb25fc3RhdGUiOiI1ZjE3NmNkYy00ZTU2LTQ3MTAtYmRmZC05YzE4MTc0MjFiN2MiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVzb3VyY2VfYWNjZXNzIjp7InN0c2FkbWluX3Jlc291cmNlIjp7InJvbGVzIjpbInByb3ZpZGVyX2FkbWluaXN0cmF0b3IiXX0sImFjY291bnQiOnsicm9sZXMiOlsidmlldy1wcm9maWxlIl19fSwiZnVsbF9uYW1lIjoiVGVzdEJydWdlcjAyIiwiY3ZyX251bWJlciI6IjY1MzA1MjE2IiwicHJlZmVycmVkX3VzZXJuYW1lIjoidGVzdDE1Iiwib3JnYW5pc2F0aW9uX25hbWUiOiJJQk0iLCJhc3N1cmFuY2VfbGV2ZWwiOiIzIiwicmlkX251bWJlciI6IjAwMDAwMDAyIn0.DYt5HRSDbIs8eLvlK9j5lIWOxWgMdWTvmW46HIwhX9aqkifWVh1taTFL8_WC8TG-5cClbdyQaWKCHzMUjRTQXlZbWYTFmGijqS_HJUMYW9smn4ZU-PPonRP23cW-Ep3dpSPqaYMh2JHx2iWytp3L0RbPFL2-OL5at-yzGFWLdp4mmYy0ieR2dV6QsL5dNmwvWBD_1skGGa0hkOSwmoejx1Brezzmvd0rxsgJV-nDtoJ6lL5S8PyjP9RSIBUS-Saiy-QACArr_bM6j4I75faXKk_G_nM2xUEO_Zgvn46PeYivltARXNnZGuz5NV9qXaIepm2Ic993d4cLv1xYadjhqA");		
	}
	
	private static void deserializeToken(String clientToken) {
    	    	
    	String[] chunks = clientToken.split("\\.");
    	Base64.Decoder decoder = Base64.getDecoder();

    	String header = new String(decoder.decode(chunks[0]));
    	String payload = new String(decoder.decode(chunks[1]));
    	
    	
    	System.out.println(header);
    	System.out.println(payload);
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	AuthData data = null;
		try {
			data = objectMapper.readValue(payload, AuthData.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	System.out.println("Data is ready:");
    	System.out.println(data);
     
	}
	
	public class AuthData {
		private String preferred_username;
		private String cvr_number;
		
		public AuthData(String preferred_username, String cvr_number) {
			super();
			this.preferred_username = preferred_username;
			this.cvr_number = cvr_number;
		}
		
		public String getPreferred_username() {
			return preferred_username;
		}
		public void setPreferred_username(String preferred_username) {
			this.preferred_username = preferred_username;
		}
		public String getCvr_number() {
			return cvr_number;
		}
		public void setCvr_number(String cvr_number) {
			this.cvr_number = cvr_number;
		}
	}

}
