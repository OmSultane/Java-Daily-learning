package example;

public class Bus implements Vehicle {
	
	DiscountService discountService;
	
	//Default constructor
	public Bus(){}
	
	//constructor injection
	Bus(DiscountService discountService){
		this.discountService = discountService;
	}
	
	//setter injection
	public void setDiscountService(DiscountService discountService) {
		this.discountService = discountService;
	}
	
	@Override
	public String getDiscountMessage() {
		return this.discountService.getDiscountMessage();
	}
	
}
