package fieldInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Vehicle vehicle = context.getBean("bus", Vehicle.class);

		
		System.out.println(vehicle.getDiscountMessage());
		
		
	}

}

/*
                -----------------> AutoWired annotation<---------------
Concept :- 


*/