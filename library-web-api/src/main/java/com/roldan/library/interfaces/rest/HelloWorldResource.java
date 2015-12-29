package com.roldan.library.interfaces.rest;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.roldan.library.application.Service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "helloworld")
@Path("helloworld")
@Singleton
public class HelloWorldResource {

	@Inject
	private Service service;
	
	@GET
	@Produces("application/json")
	@ApiOperation(value = "Hello greeting", notes = "Get hello greeting")
	public Response getHello() {
		Greeting greeting = new Greeting(service.getGreeting(), "Jorge");
		return Response.status(Response.Status.OK).entity(greeting).build(); 
	}
}
