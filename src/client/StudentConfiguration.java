package client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import persistence.StudentDaoImpl;
import presentation.StudentPresentationImpl;
import service.StudentServiceImpl;

@Configuration
public class StudentConfiguration {
	
	@Bean(name="dao")
	public StudentDaoImpl getPersistence() {  //connecting with persistence
		return new StudentDaoImpl();
	}
	
	@Bean(name="service")
	public StudentServiceImpl getStudentService() {  //connecting with service
		//Constructor Injection- we are using about constructor
		return new StudentServiceImpl(getPersistence());    
	}
	
	@Bean(name="stuPresentation")
	public StudentPresentationImpl getStudentPresentation() {
		
		//Setter Injection
		StudentPresentationImpl presentation = new StudentPresentationImpl();
		presentation.setStudentService(getStudentService());
		return presentation;
	}

}
