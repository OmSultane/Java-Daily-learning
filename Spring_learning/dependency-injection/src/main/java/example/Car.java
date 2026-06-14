package example;

public class Car implements Vehicle {
	
DiscountService discountService;
	
	public Car(DiscountService discountService){
		this.discountService = discountService;
	}
	
	public String getMileage() {
		return "50kmpl";
	}

	@Override
	public String getDiscountMessage() {
		return this.discountService.getDiscountMessage();
	}

}
