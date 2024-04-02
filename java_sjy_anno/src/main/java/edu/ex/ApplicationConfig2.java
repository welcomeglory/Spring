package edu.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class ApplicationConfig2 {
	
	@Bean 
   public Student student1() {
      ArrayList<String> hobbys = new ArrayList<String>();
      hobbys.add("수영");
      hobbys.add("요리");
      
      Student student = new Student("홍해인", 20, hobbys);
      student.setHeight(180);
      student.setWeight(80);
      
      return student;
   }
   
}