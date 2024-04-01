package edu.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.setFirstNum(10);
		calculator.setSecondNum(10);

		calculator.add();
		calculator.sub();
		
		//-------------------------------
		//스프링 활용
		String configLocation ="classpath:appCTX.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
//		calculator = (Calculator)ctx.getBean("calculator"); 
		//위와 동일한 결과
		calculator = ctx.getBean("calculator", Calculator.class); 
		System.out.println(calculator);	
		
		calculator.setFirstNum(10);
		calculator.setSecondNum(10);

		calculator.add();
		calculator.sub();
		//객체 생성
		MyCalculator myCalculator =(MyCalculator) ctx.getBean("myCalculator");
		System.out.println(myCalculator);	
		System.out.println(myCalculator.getFirstNum());	
		System.out.println(myCalculator.getSecondNum());	
		
		myCalculator.add();
		myCalculator.sub();
	}
}
