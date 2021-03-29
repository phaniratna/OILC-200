package com.ojas.pers.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
@Configuration
public class JaxbConfig {
	@Bean
	public Jaxb2Marshaller createJaxb2Marshaller(@Value("${context.path}") final String contextPath,
			@Value("$schema.location}"),final Resource schemaResource)) {
		
		 Jaxb2Marsheller marshaller = new 	Jaxb2Marsheller();
		 
	}

}
