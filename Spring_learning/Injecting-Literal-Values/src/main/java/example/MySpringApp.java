package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Vehicle vehicle = context.getBean("myVehicle", Vehicle.class);

		
		
		System.out.println(vehicle.getBrandName());

		
	}

}

/*
                -----------------> DEPENDENCY INJECTION <---------------
Concept :- 
There are two implemenation classes Bus & Car of interface Vehicle 
There is also interface DiscountService with implementation class FestivalDiscount
In Bus & Car we also want the Discount feature which is in DiscountService so the bus & car have a dependency on interface DiscountService
	~we just want to call the getDiscountMessage whose implementaion is written in FestivalDiscount by vehicle variable like vehicle.getDiscountMessage() for that we have to inject dependency of DiscountService as ***DiscountService discountService;

### So in Bus & Car what we are doing is 
(i)Making an dependency **DiscountService discountService;
(ii)But the dependency is currently null so we have to pass the object/bean of FestivalDiscount
(iii)We can pass the object/bean through constructor-arg in this ex. using xml 
(iv)In XML we are creating a bean of example.FestivalDiscount and passing the ref of it uisng myVehicle bean 
(v)As the bean of myVehicle is made the ref of example.FestivalDiscount(MyDiscountService) is passed in Bus() contructor and our dependency in Bus is assigned with FestivalDiscount object 
(vi)Now we can just call whatever method of discountService we want in Bus cuz we have injected the Dependency of DiscountMessage in Bus / Car

*/