package com.github.mangelt.standalone.context.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.github.mangelt.standalone.context.service","com.github.mangelt.standalone.context.component"})
public class SecondContextConfiguration {
}
