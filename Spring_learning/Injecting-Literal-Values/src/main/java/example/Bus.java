package example;

public class Bus implements Vehicle {
	
	private String brandName;
	private Double maximumRetailPrice;
	
	public String getBrandName() {
		return brandName;
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public void setMaximumRetailPrice(Double price) { 
		maximumRetailPrice = price;
	}
	  
	@Override
	public Double getMaximumRetailPrice() {
		return maximumRetailPrice; 
	}

}
