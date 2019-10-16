package com.github.mangelt.standalone.context.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"com.github.mangelt.standalone.context.service","com.github.mangelt.standalone.context.component"})
@Import({BeanConfiguration.class})
public class FirstContextConfiguration {
}
