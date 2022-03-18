package com.xonatis.example.main;

import java.io.IOException;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.core.CacheControl;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.ext.Provider;
import jakarta.ws.rs.ext.RuntimeDelegate;

@Cached
@Provider
public class CacheFilter implements ContainerResponseFilter {

	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		
		CacheControl policy = new CacheControl();
		policy.setMaxAge(120);
		
		String header = RuntimeDelegate.getInstance().createHeaderDelegate(CacheControl.class).toString(policy);
		responseContext.getHeaders().add(HttpHeaders.CACHE_CONTROL, header);
		
	}

}
