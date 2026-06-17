package constructorInjection;

public class Car implements Vehicle {
	
DiscountService discountService;
	
	@Override
	public String getDiscountMessage() {
		return this.discountService.getDiscountMessage();
	}

}
