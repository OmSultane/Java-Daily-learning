package fieldInjection;

import org.springframework.stereotype.Component;

@Component 
public class FestivalDiscount implements DiscountService {

	@Override
	public String getDiscountMessage() {
		return "Please contact customer care";
	}

}
