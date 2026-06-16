package example;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle {

	@Override
	public String getMileage() {
		return "20kmpl";
	}

}
 