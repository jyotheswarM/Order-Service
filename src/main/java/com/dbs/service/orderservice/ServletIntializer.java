package com.dbs.service.orderservice;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletIntializer extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(org.springframework.boot.builder.SpringApplicationBuilder application) {
		return application.sources(OrderServiceApplication.class);
		
	}

}
