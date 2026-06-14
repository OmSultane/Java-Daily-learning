package example;

public class Bus implements Vehicle {
	
	DiscountService discountService;
	
	 Bus(){}

	Bus(DiscountService discountService){
		this.discountService = discountService;
	}
	
	@Override
	public String getMileage() {
		return "30kmpl";
	}
	
	@Override
	public String getDiscountMessage() {
		return this.discountService.getDiscountMessage();
	}

}
