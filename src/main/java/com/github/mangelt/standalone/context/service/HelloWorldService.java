package com.github.mangelt.standalone.context.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
	public void hello(String name) {
		System.out.println("HelloService " + name);
	};
}
