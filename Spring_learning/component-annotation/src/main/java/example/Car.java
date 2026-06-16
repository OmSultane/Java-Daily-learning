package example;

import org.springframework.stereotype.Component;

@Component 
public class Car implements Vehicle {
 
	@Override
	public String getMileage() {
		return "40kmpl"; 
	}

}
