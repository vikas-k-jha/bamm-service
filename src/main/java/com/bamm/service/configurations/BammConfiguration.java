/**
 * BammConfiguration.java
 * bamm-service
 * 
 */

package com.bamm.service.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.bamm.service")
public class BammConfiguration implements WebMvcConfigurer {
	
	
	@Override
	  public void configureViewResolvers (ViewResolverRegistry registry) {
	      //by default prefix = "/WEB-INF/" and  suffix = ".jsp"
	      registry.jsp().prefix("/WEB-INF/views/");
	  }
	
}
