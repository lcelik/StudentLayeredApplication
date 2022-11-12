package client;

import java.util.Scanner;

import presentation.StudentPresentation;
import presentation.StudentPresentationImpl;

public class StudentClient {

	public static void main(String[] args) {
		
	
		Scanner scanner=new Scanner(System.in);
		
	StudentPresentation studentPresentation = new StudentPresentationImpl();
		
	while(true) {
		studentPresentation.showMenu();
		System.out.println("Enter Choice : ");
		int choice=scanner.nextInt();
		studentPresentation.performMenu(choice);
	}
}
}
