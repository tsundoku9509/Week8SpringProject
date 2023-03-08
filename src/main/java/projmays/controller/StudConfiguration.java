package projmays.controller;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import projmays.beans.StudentInfo;

@Configuration
@EnableAutoConfiguration
public class StudConfiguration {
	
	@Bean
	
	 StudentInfo studentinfo() {
		StudentInfo stud = new StudentInfo();
		stud.setName("Harry Potter");
		stud.setId(19970626);
		stud.setMajor("Potions");
		stud.setYear("Senior");
		stud.setTuition(20000.00);
		
		return stud;
	}

}
