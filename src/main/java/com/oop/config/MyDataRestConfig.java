package com.oop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.oop.entity.StudentEntity;

@Configuration
public class MyDataRestConfig  implements RepositoryRestConfigurer{
	
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors){

	HttpMethod[] unsupportedMethods = {HttpMethod.PUT,HttpMethod.DELETE};
	config.getExposureConfiguration()
		  .forDomainType(StudentEntity.class)
		  .withItemExposure((metadata,http)->http.disable(unsupportedMethods))
		  .withCollectionExposure((metaDate,http)->http.disable(unsupportedMethods));
	
 }
}
