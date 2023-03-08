package projmays;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import java.util.List;
import projmays.repo.StudRepository;
import projmays.controller.StudConfiguration;
import projmays.beans.StudentInfo;


@SpringBootApplication
public class SimpleSpringProjMaysApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringProjMaysApplication.class, args);
	}
	@Autowired
	StudRepository repo;
	
	public void run(String... args) throws Exception{
		ApplicationContext appContext = new AnnotationConfigApplicationContext(StudConfiguration.class);
		
		StudentInfo si = appContext.getBean("studentinfo", StudentInfo.class);
		si.setName("Luke Skywalker");
		repo.save(si);
		
		StudentInfo sii = new StudentInfo("Darth Vader", 19770525, "Dark Side", "Junior", 1000000.00);
		repo.save(sii);
		
		List<StudentInfo> allStudents = repo.findAll();
		for(StudentInfo students: allStudents) {
			System.out.println(students.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}

}
