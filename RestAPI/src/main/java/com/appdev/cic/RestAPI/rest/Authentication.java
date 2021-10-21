package com.appdev.cic.RestAPI.rest;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

import com.appdev.cic.RestAPI.model.AuthData;
import com.appdev.cic.RestAPI.util.TokenDecoder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;


// Token used to test this
// eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJkdkROUGJVSUFMR0ZkQUdFMmY1Slh5Z3VuMW5ZTjdRS2hVTzR4TkxZbHB3In0.eyJqdGkiOiI5MTc4ZjhlOC0xMDE4LTQ2YzEtODlkMS1jZjIwNWYyZmE2MjUiLCJleHAiOjE2MzQ3MjQ0NzEsIm5iZiI6MCwiaWF0IjoxNjM0NzI0NDExLCJpc3MiOiJodHRwczovL3NhbWwuYWRtaW4taWJtcHJlZXh0dGVzdC5zZXJ2aWNlcGxhdGZvcm1lbi5kay9hdXRoL3JlYWxtcy9hZG1pbmlzdHJhdGlvbiIsImF1ZCI6ImFkbWluaXN0cmF0aW9uIiwic3ViIjoiZTY5NDFkMmMtYTRkYS00NDI3LTg5MzAtOWVmNWQ0NzUwNjc0IiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiYWRtaW5pc3RyYXRpb24iLCJhdXRoX3RpbWUiOjE2MzQ3MjQ0MTEsInNlc3Npb25fc3RhdGUiOiI1ZjE3NmNkYy00ZTU2LTQ3MTAtYmRmZC05YzE4MTc0MjFiN2MiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVzb3VyY2VfYWNjZXNzIjp7InN0c2FkbWluX3Jlc291cmNlIjp7InJvbGVzIjpbInByb3ZpZGVyX2FkbWluaXN0cmF0b3IiXX0sImFjY291bnQiOnsicm9sZXMiOlsidmlldy1wcm9maWxlIl19fSwiZnVsbF9uYW1lIjoiVGVzdEJydWdlcjAyIiwiY3ZyX251bWJlciI6IjY1MzA1MjE2IiwicHJlZmVycmVkX3VzZXJuYW1lIjoidGVzdDE1Iiwib3JnYW5pc2F0aW9uX25hbWUiOiJJQk0iLCJhc3N1cmFuY2VfbGV2ZWwiOiIzIiwicmlkX251bWJlciI6IjAwMDAwMDAyIn0.DYt5HRSDbIs8eLvlK9j5lIWOxWgMdWTvmW46HIwhX9aqkifWVh1taTFL8_WC8TG-5cClbdyQaWKCHzMUjRTQXlZbWYTFmGijqS_HJUMYW9smn4ZU-PPonRP23cW-Ep3dpSPqaYMh2JHx2iWytp3L0RbPFL2-OL5at-yzGFWLdp4mmYy0ieR2dV6QsL5dNmwvWBD_1skGGa0hkOSwmoejx1Brezzmvd0rxsgJV-nDtoJ6lL5S8PyjP9RSIBUS-Saiy-QACArr_bM6j4I75faXKk_G_nM2xUEO_Zgvn46PeYivltARXNnZGuz5NV9qXaIepm2Ic993d4cLv1xYadjhqA

@Path("/auth")
public class Authentication {
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser(@HeaderParam("Authorization") String clientToken) throws JsonMappingException, JsonProcessingException {

//    	String role = jsonNode.get("resource_access");

    	System.out.println("cvr: " + TokenDecoder.getCVRNumber(clientToken));
    	System.out.println("role: " + TokenDecoder.getRole(clientToken));
    	
        return Response.ok().build();
    }
}
