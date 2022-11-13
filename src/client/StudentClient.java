package client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import presentation.StudentPresentation;
import presentation.StudentPresentationImpl;

public class StudentClient {

	public static void main(String[] args) {
		
	
		Scanner scanner=new Scanner(System.in);
		
//	StudentPresentation studentPresentation = new StudentPresentationImpl();
		
//		AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext(StudentConfiguration.class);
		
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("student.xml"); //we add this for xml configuration
		
		StudentPresentation studentPresentation = (StudentPresentation) springContainer.getBean("stuPresentation");
		
	while(true) {
		studentPresentation.showMenu();
		System.out.println("Enter Choice : ");
		int choice=scanner.nextInt();
		studentPresentation.performMenu(choice);
	}
}
}
