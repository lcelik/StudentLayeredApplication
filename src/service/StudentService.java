package service;

import java.util.Collection;

import entity.Student;

public interface StudentService {

	 Collection<Student> getAllStudents(); //list all students
	 Student searchStudentByRollNo(int rollNo); //search student by roll no
	 boolean addStudent(Student student);  //add Student
	 
	 
	 
	 
	 
	

}
