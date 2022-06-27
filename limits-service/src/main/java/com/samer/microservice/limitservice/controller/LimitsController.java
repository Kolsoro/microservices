package com.samer.microservice.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samer.microservice.limitservice.bean.Limits;
import com.samer.microservice.limitservice.configuration.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration configuration;

	@GetMapping(path = "/limits")
	private Limits retriveLimits() {
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
		
	}
	
}
