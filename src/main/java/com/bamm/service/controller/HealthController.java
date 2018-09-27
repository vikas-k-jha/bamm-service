package com.bamm.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bamm.service.constants.ResourceAPI;

@RestController
public class HealthController {
	
	/**
	 * @return
	 */
	@GetMapping(ResourceAPI.HEALTH)
	@ResponseStatus(HttpStatus.OK)
    public String health() {
        return "Greetings from BAMM!";
    }

}
