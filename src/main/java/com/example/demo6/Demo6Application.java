package com.example.demo6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo6Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo6Application.class, args);

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Home home= (Home) context.getBean("p1");
		System.out.println(home);

		context.registerShutdownHook(); //This method is mandate for destroy

		//If we have multiple beans, then 1st the setter methods, then the init method for both the beans will get execute 1st
		//Then the destroy methods by order


	}

}
