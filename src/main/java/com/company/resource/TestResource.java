package com.company.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/v1/test")
@Produces(value = MediaType.APPLICATION_JSON)
public class TestResource {
    @GET
    public String testMethod(){
        return "This is for testing the deployment";
    }
}
