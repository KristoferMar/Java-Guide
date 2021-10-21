package com.appdev.cic.RestAPI.util;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TokenDecoder {
	
	public static String getCVRNumber(String token) throws JsonMappingException, JsonProcessingException {
    	ObjectMapper objectMapper = new ObjectMapper();
    	JsonNode jsonNode = objectMapper.readTree(deserialzeToken(token));
		return jsonNode.get("cvr_number").asText();
	}
	
	public static String getRole(String token) throws JsonMappingException, JsonProcessingException {
    	ObjectMapper objectMapper = new ObjectMapper();
    	JsonNode jsonNode = objectMapper.readTree(deserialzeToken(token));
    	
    	List<String> role = new ArrayList<String>();
    	
    	JsonNode resource_access = jsonNode.path("resource_access");
    	JsonNode stsadmin_resource = resource_access.path("stsadmin_resource");
    	JsonNode roles = stsadmin_resource.path("roles");
    	if(roles.isArray()) {
    		for(JsonNode node : roles) {
    			role.add(removeFirstAndLast(node.toString()));
    		}
    	}
    	
    	return authMapper(role.get(0));
	}
	
	private static String deserialzeToken(String token) {
    	String[] chunks = token.split("\\.");
    	Base64.Decoder decoder = Base64.getDecoder();

    	String header = new String(decoder.decode(chunks[0]));
    	String payload = new String(decoder.decode(chunks[1]));
    	return payload;
	}
	
	private static String removeFirstAndLast(String str) {
	       str = str.substring(1, str.length() - 1);	       
	       return str;
	}
	
	private static String authMapper(String role) {
		switch (role) {
		case "kombit_administrator":
			return "admin";
		case "agreement_administrator":
			return "authority";
		case "provider_administrator":
			return "provider";
		default:
			break;
		}
		return "undefined";
	}
}
