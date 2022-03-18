package com.xonatis.example.facade;

import com.xonatis.example.domain.Car;
import com.xonatis.example.dto.CarRequest;
import com.xonatis.example.service.EntityService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("entities")
@Produces(MediaType.APPLICATION_JSON)
public class EntityFacade {

	private EntityService service;
	
	@Inject
	public EntityFacade(EntityService service) {
		this.service = service;
	}
	
	@GET
	public Response list() {
		return Response.ok(this.service.list()).build();
	}
	
	@GET
	@Path("search")
	public Response search(@QueryParam("q") String text) {
		return Response.ok(this.service.search(text)).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(CarRequest dto) {
		Car car = new Car(dto.seats);
		return Response.ok(this.service.create(car)).build();
	}
	
}
