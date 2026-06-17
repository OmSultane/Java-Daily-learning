package constructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component; 
  
@Component
public class Bus implements Vehicle { 
	
	DiscountService discountService; 
	
	@Autowired 
	Bus(DiscountService discountService){
		this.discountService = discountService;
		
	}
	@Override
	public String getDiscountMessage() {
		return this.discountService.getDiscountMessage();
	}
	
}
