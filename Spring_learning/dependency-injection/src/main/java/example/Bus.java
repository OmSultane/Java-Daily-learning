package example;

public class Bus implements Vehicle {
	
	DiscountService discountService;
	
	
	public Bus(){}
	//constructor injection
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
