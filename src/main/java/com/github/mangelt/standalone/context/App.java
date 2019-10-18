package com.github.mangelt.standalone.context;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.github.mangelt.standalone.context.component.HelloWorldComponent;
import com.github.mangelt.standalone.context.config.BeanConfiguration;
import com.github.mangelt.standalone.context.config.FirstContextConfiguration;
import com.github.mangelt.standalone.context.config.SecondContextConfiguration;
import com.github.mangelt.standalone.context.service.HelloWorldService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        
        app.firstContext();
        app.springContext();
    }
    
    public void firstContext() {
    	AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(FirstContextConfiguration.class);
    	System.out.println("Beans in the context");
    	System.out.println(con.getBean("helloWorldComponent"));
    	System.out.println(con.getBean(HelloWorldComponent.class));
    	System.out.println(con.getBean("helloWorldService"));
    	System.out.println(con.getBean(HelloWorldService.class));
    	System.out.println(con.getBean(BeanConfiguration.class).property);
    	System.out.println(con.getBean("say_hello"));
    }
    
    public void springContext() {
    	ApplicationContext con = SpringApplication.run(SecondContextConfiguration.class, new String[0]);
    	System.out.println("Beans in the context");
    	System.out.println(con.getBean("helloWorldComponent"));
    	System.out.println(con.getBean(HelloWorldComponent.class));
    	System.out.println(con.getBean("helloWorldService"));
    	System.out.println(con.getBean(HelloWorldService.class));
    	System.out.println(con.getBean(BeanConfiguration.class).property);
    	System.out.println(con.getBean("say_hello"));
    }
}
