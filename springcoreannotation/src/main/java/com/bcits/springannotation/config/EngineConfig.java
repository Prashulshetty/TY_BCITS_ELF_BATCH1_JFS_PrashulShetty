package com.bcits.springannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bcits.springannotation.beans.Engine;

@Configuration
public class EngineConfig {
	@Bean
	public Engine getEngine() {
		Engine engine = new Engine();
		engine.setCc(2300);
		engine.setType("Disel");
		return engine;
		
		
	}

}
