package persistence;

import java.util.Collection;

import database.StudentDataBase;
import entity.Student;

public class StudentDaoImpl implements StudentDao {

	@Override
	public Collection<Student> getAllRecords() {
		
		return StudentDataBase.getStudentList().values();
	}


	@Override
	public Student searchRecord(int rollNo) {
		return StudentDataBase.getStudentList().get(rollNo);
	}

	@Override
	public Student insertRecord(Student student) {
		return  StudentDataBase.getStudentList().put(student.getRollNo(), student);
	}


}
