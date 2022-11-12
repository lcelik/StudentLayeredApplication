package presentation;

import java.util.Collection;
import java.util.Scanner;

import entity.Student;
import service.StudentService;
import service.StudentServiceImpl;

public class StudentPresentationImpl implements StudentPresentation {
	
	//Presentation will pass the request to service for processing and gives response to client
	private StudentService studentService = new StudentServiceImpl();

	@Override
	public void showMenu() {
		System.out.println("===========================");
		System.out.println("Student Managment System");
		System.out.println("1.List all the Students");
		System.out.println("2.Add New Student");
		System.out.println("3.Exit");
	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner = new Scanner(System.in);
		switch(choice) {
		case 1:
			Collection<Student> students = studentService.getAllStudents();
			for(Student stu:students) {
				System.out.println(stu);
			}
			break;
		case 2:
			Student newStudent = new Student();
			
			System.out.println("Enter Student Roll No");
			newStudent.setRollNo(scanner.nextInt());
			
			System.out.println("Enter Student Name");
			newStudent.setStudentName(scanner.next());
			
			System.out.println("Enter Student Grade");
			newStudent.setStudentGrade(scanner.nextInt());
			
			if(studentService.addStudent(newStudent)) {
				System.out.println("Student Added");
			} else {
				System.out.println("Student with Roll No" + newStudent.getRollNo() + " already exist, so cannot add it as a new Student!");
			}
			break;
		case 3:
			System.out.println("Thank you for using Student Managment System");
			System.exit(0);
			default:
				System.out.println("Invalid Choice!");
				break;
		}
		
		
	}

}
