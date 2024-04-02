package edu.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Indicates that a class declares one or more 
//@Bean methods and may be processedby 
//the Spring container to generate bean definitions and 
//service requests for thosebeans at runtime, for example: 

//시멘틱 태그(nav = (div+메뉴))
@Configuration //@Component(new)  + 설정 의미
public class ApplicationConfig {
	
	// Indicates that a method produces a bean to be managed by the Spring container.
	// The names and semantics of the attributes to this annotation are intentionallysimilar to those of the <bean/> element in the Spring XML schema. Forexample: 
	//	<bean id="student1" class="edu.ex.Student">이것과 동일한 작업
	@Bean // 함수이름이 변수 명이 됨. Student student1 = new ~~~ 
   public Student student1() {
      ArrayList<String> hobbys = new ArrayList<String>();
      hobbys.add("수영");
      hobbys.add("요리");
      
      Student student = new Student("홍길동", 20, hobbys);
      student.setHeight(180);
      student.setWeight(80);
      
      return student;
   }
   
   @Bean
   public Student student2() {
      ArrayList<String> hobbys = new ArrayList<String>();
      hobbys.add("독서");
      hobbys.add("음악감상");
      
      Student student = new Student("홍길순", 18, hobbys);
      student.setHeight(170);
      student.setWeight(55);
      
      return student;
   }
   
}