package com.xonatis.example.main;

import java.io.IOException;
import java.util.Base64;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.Provider;

@Secured
@Provider
public class SecurityFilter implements ContainerRequestFilter {

	public void filter(ContainerRequestContext requestContext) throws IOException {
		
		try {
			String value = requestContext.getHeaderString("Authorization");
			String token = value.substring(6);
			String claim = new String(Base64.getDecoder().decode(token));
			if (!claim.equals("admin:admin")) {
				requestContext.abortWith(Response.status(Status.UNAUTHORIZED).build());
			}
		} catch(Exception e) {
			requestContext.abortWith(Response.status(Status.UNAUTHORIZED).build());
		}
		
	
	}

}
