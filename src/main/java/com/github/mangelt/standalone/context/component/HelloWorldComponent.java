package com.github.mangelt.standalone.context.component;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldComponent {
	public void hello(String name) {
		System.out.println("HelloComponent " + name);
	}
}
