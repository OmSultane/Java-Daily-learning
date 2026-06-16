package example;

public class Car implements Vehicle {
	
DiscountService discountService;

    public Car(){}
    
	//constructor injection
	Car(DiscountService discountService){
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
