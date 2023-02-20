package com.example.airlineTest.configuration;

import com.example.airlineTest.model.AircraftFleet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringAirlineConfiguration {
	
	@Bean
	public AircraftFleet aircraftFleet() {
		return new AircraftFleet();
	}
}
