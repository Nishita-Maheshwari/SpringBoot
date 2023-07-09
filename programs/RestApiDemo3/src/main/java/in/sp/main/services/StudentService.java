package in.sp.main.services;

import java.util.List;

import in.sp.main.beans.Student;

public interface StudentService 
{
	public Student addStudent(Student std);
	public List<Student> getAllStudent();
	public Student getStudentDetails(int id);
	public Student updateStudent(Student std);
	public boolean deleteStudent(int id);
}
