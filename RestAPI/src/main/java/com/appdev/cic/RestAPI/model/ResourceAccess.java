package com.appdev.cic.RestAPI.model;

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
public class ResourceAccess {
    @JsonProperty("stsadmin_resource")
	private StsAdminAccess stsadmin_resource;
}
