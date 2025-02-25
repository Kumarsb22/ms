package com.SBMS_REST_REPO.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.SBMS_REST_REPO.entities.Book;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);

		HttpMethod[] unSupportMethods = { HttpMethod.PUT, HttpMethod.DELETE };

		config.getExposureConfiguration().forDomainType(Book.class)
				.withItemExposure((metadat, http) -> http.disable(unSupportMethods))
				.withCollectionExposure((metadata, http) -> http.disable(unSupportMethods));
	}
}
