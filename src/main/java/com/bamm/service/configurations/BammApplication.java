/**
 * BammApplication.java
 * bamm-service
 * 
 */

package com.bamm.service.configurations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Default SpringBoot context initializer class
 * @author Vikas Jha
 *
 */
@SpringBootApplication
public class BammApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
        SpringApplication.run(BammApplication.class, args);
    }
	
	
	
}
