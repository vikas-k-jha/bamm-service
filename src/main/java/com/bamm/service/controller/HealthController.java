package com.bamm.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.bamm.service.constants.ResourceAPI;

@Controller
public class HealthController {
	
	@GetMapping(ResourceAPI.HEALTH)
	@ResponseStatus(HttpStatus.OK)
    public String health() {
        return "Greetings from BAMM!";
    }

}
