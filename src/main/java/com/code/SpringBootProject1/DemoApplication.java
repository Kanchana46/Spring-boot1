package com.code.SpringBootProject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		User user = context.getBean(User.class);
		user.setId(1);
		user.setName("John");
		user.setAge(20);
		
		Vehicle vehicle = context.getBean(Vehicle.class);
		vehicle.setId(10);
		vehicle.setName("car");
		user.setVehicle(vehicle);
		
		System.out.println(user);	
	}
}
