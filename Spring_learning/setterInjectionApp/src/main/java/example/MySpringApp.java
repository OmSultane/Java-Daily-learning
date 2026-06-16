package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Vehicle vehicle = context.getBean("myVehicle", Bus.class);

		
		System.out.println(vehicle.getDiscountMessage());
		
		
	}

}

/*
                -----------------> DEPENDENCY INJECTION USING SETTER AND GETTER<---------------
Concept :- 


*/