package com.in28Minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {
	
	@Autowired
	private CurrencyConfigurationService configuration;
	
	@RequestMapping("/currency-configuration")
	public CurrencyConfigurationService service() {
		return configuration ;
	}
	
	}


