package com.github.mangelt.standalone.context.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"com.github.mangelt.standalone.context.service","com.github.mangelt.standalone.context.component"})
@Import({BeanConfiguration.class})
public class FirstContextConfiguration {
	
	@Autowired(required = true)
	@Qualifier("say_hello")
	public String he;
	
	@Autowired
	public int myValue;
	
	@Autowired
	public void printHe() {
		System.out.println(he);
		System.out.println("number: " + myValue);
	}
	
}
