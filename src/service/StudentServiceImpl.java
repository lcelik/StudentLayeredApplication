package service;

import java.util.Collection;

import entity.Student;
import persistence.StudentDao;
import persistence.StudentDaoImpl;

public class StudentServiceImpl implements StudentService{
	
	//Service will request persistence layer for all data needs
	private StudentDao studentDao = new StudentDaoImpl();

	@Override
	public Collection<Student> getAllStudents() {
		
		return studentDao.getAllRecords();
		}

	@Override
	public Student searchStudentByRollNo(int rollNo) {
		
		return studentDao.searchRecord(rollNo);
	}

	@Override
	public boolean addStudent(Student student) {
		
		Student stu = studentDao.searchRecord(student.getRollNo());
		if(stu!=null) {
			return false;
		}
		studentDao.insertRecord(student);
		return true;
	}

}
