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
		System.out.println("CVR NUMBER: " + jsonNode.get("cvr_number").asText());
		return jsonNode.get("cvr_number").asText();
	}

	public static String getRole(String token) throws JsonMappingException, JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = objectMapper.readTree(deserialzeToken(token));

		List<String> roleList = new ArrayList<String>();

		JsonNode resource_access = jsonNode.path("resource_access");
		JsonNode stsadmin_resource = resource_access.path("stsadmin_resource");
		JsonNode roles = stsadmin_resource.path("roles");
		if (roles.isArray()) {
			for (JsonNode node : roles) {
				roleList.add(removeFirstAndLast(node.toString()));
			}
		}

		return authMapper(roleList);
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

	private static String authMapper(List<String> roles) {
		if (roles.contains("kombit_administrator")) {
			return "admin";
		}
		if (roles.contains("agreement_administrator")) {
			return "authority";
		}
		if (roles.contains("provider_administrator")) {
			return "provider";
		}
		return "undefined";
	}
}
