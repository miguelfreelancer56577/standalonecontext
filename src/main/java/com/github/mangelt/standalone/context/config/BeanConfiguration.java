package com.github.mangelt.standalone.context.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@Configuration
@PropertySource("classpath:app.properties")
public class BeanConfiguration {
	
	@Value("${cache.initial.capacity}")
	public String property;

	@Bean("say_hello")
	public String hello() {
		return "Hello world.";
	}
	
	@Bean
	public int myValue() {
		return 34555;
	}
	
}
