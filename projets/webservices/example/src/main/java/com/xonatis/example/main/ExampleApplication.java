package com.xonatis.example.main;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.internal.inject.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import com.xonatis.example.facade.EntityFacade;
import com.xonatis.example.provider.CarProvider;
import com.xonatis.example.provider.EntityProvider;
import com.xonatis.example.provider.TruckProvider;
import com.xonatis.example.service.EntityService;

import jakarta.ws.rs.core.UriBuilder;

public class ExampleApplication {
	public static void main(String[] args) {
		URI uri = UriBuilder.fromUri("http://localhost/api/").port(9991).build();
		
		ResourceConfig rc = new ResourceConfig();
		rc.register(EntityFacade.class);
		rc.register(new AbstractBinder() {

			@Override
			protected void configure() {
				
				bind(EntityService.class).to(EntityService.class);
				bind(CarProvider.class).to(EntityProvider.class).named("CarProvider");
				bind(TruckProvider.class).to(EntityProvider.class).named("TruckProvider");
			}
			
		});
		rc.register(SecurityFilter.class);
		rc.register(CacheFilter.class);
		
		HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, rc);
		try {
			server.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
