package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mySpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Vehicle bean = context.getBean("car",Vehicle.class);
		
		System.out.println(bean.getMileage());

	}

}
