package com.kristofer.restapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AuthData {
	
	private String jti;
	private Integer exp;
	private Integer nbf;
	private Integer iat;
	private String iss;
	private String aud;
	private String sub;
	private String typ;
	private String azp;
	private Integer auth_time;
	private String session_state;
	private String acr;
	
    @JsonProperty("resource_access")
	private ResourceAccess resource_access;
	
    @JsonProperty("full_name")
	private String full_name;
    
	private String cvr_number;
	private String preferred_username;
	private String organisation_name;
	private String assurance_level;
	private String rid_number;
	
}
/*
{
    "jti": "9178f8e8-1018-46c1-89d1-cf205f2fa625",
    "exp": 1634724471,
    "nbf": 0,
    "iat": 1634724411,
    "iss": "https://saml.admin-ibmpreexttest.serviceplatformen.dk/auth/realms/administration",
    "aud": "administration",
    "sub": "e6941d2c-a4da-4427-8930-9ef5d4750674",
    "typ": "Bearer",
    "azp": "administration",
    "auth_time": 1634724411,
    "session_state": "5f176cdc-4e56-4710-bdfd-9c1817421b7c",
    "acr": "1",
    "allowed-origins": [
        "*"
    ],
    "resource_access": {
        "stsadmin_resource": {
            "roles": [
                "provider_administrator"
            ]
        },
        "account": {
            "roles": [
                "view-profile"
            ]
        }
    },
    "full_name": "TestBruger02",
    "cvr_number": "65305216",
    "preferred_username": "test15",
    "organisation_name": "IBM",
    "assurance_level": "3",
    "rid_number": "00000002"
}
*/
