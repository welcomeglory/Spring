package edu.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainClass{
	public static void main(String[] args) {
		//Annotation전용 스프링 생성
		AbstractApplicationContext ctx = 
				new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Student student1 = ctx.getBean("student1",Student.class);
		System.out.println("이름 : "+student1.getName() );
		System.out.println("나이 : "+student1.getAge() );
		System.out.println("취미 :" +student1.getHobbys());
		System.out.println("키 : "+student1.getHeight());
		System.out.println("몸무게 : "+student1.getWeight());
		
		System.out.println("=================================");
		
		Student student2 = (Student)ctx.getBean("student2");
		System.out.println("이름 : "+student2.getName() );
		System.out.println("나이 : "+student2.getAge() );
		System.out.println("취미 :" +student2.getHobbys());
		System.out.println("키 : "+student2.getHeight());
		System.out.println("몸무게 : "+student2.getWeight());

		System.out.println("=================================");
		
		student2 = (Student)ctx.getBean("student6");
		System.out.println("이름 : "+student2.getName() );
		System.out.println("나이 : "+student2.getAge() );
		System.out.println("취미 :" +student2.getHobbys());
		System.out.println("키 : "+student2.getHeight());
		System.out.println("몸무게 : "+student2.getWeight());
		
		System.out.println("=================================");
		
		Grade grade = (Grade)ctx.getBean("grade");
		System.out.println("총점 : "+grade.getSum() );
		System.out.println("평균 : "+grade.getAvg() );
		System.out.println("성적 :" +grade.getGrades());
		
		




	}	
}