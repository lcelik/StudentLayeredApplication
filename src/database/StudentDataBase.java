package database;

import java.util.LinkedHashMap;
import java.util.Map;

import entity.Student;

//import entity.Student;


public class StudentDataBase {

	
static private Map<Integer, Student> studentList=new LinkedHashMap<Integer, Student>();
	
	
	static {
		studentList.put(101, new Student("AAAA", 1, 5));
		studentList.put(102, new Student("BBBB", 2, 4));
		studentList.put(103, new Student("CCCC", 3, 5));
		studentList.put(104, new Student("DDDD", 4, 4));
		studentList.put(105, new Student("EEEE", 5, 3));
		
	}

	public static Map<Integer, Student> getStudentList() {
		return studentList;
	}
	
	
	
	
}
