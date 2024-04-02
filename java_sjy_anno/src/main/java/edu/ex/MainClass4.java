package edu.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass4{
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext();
				
		ctx.load("classpath:appCTX.xml");
		ctx.refresh();
		
//		Student student2 = (Student)ctx.getBean("student2");
//		System.out.println("이름 : "+student2.getName() );
//		System.out.println("나이 : "+student2.getAge() );
//		System.out.println("취미 :" +student2.getHobbys());
//		System.out.println("키 : "+student2.getHeight());
//		System.out.println("몸무게 : "+student2.getWeight());
		
		ctx.close();
	}	
}