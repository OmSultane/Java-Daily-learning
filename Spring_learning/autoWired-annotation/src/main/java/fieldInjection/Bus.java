package fieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component; 
  
@Component
public class Bus implements Vehicle { 
	
	@Autowired
	DiscountService discountService; 
	
	
	@Override
	public String getDiscountMessage() {
		return this.discountService.getDiscountMessage();
	}

	
	
}
