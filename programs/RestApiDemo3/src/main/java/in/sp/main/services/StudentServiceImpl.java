package in.sp.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.beans.Student;
import in.sp.main.dao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	StudentDao studentDao;
	
	@Override
	public Student addStudent(Student std)
	{
		Student student = studentDao.save(std);
		return student;
	}

	@Override
	public List<Student> getAllStudent()
	{
		List<Student> students_list = studentDao.findAll();
		return students_list;
	}

	@Override
	public Student getStudentDetails(int id) 
	{
		Optional<Student> optional = studentDao.findById(id);
		return optional.get();
	}

	@Override
	public Student updateStudent(Student std)
	{
		Student student = studentDao.save(std);
		return student;
	}

	@Override
	public boolean deleteStudent(int id) 
	{
		boolean status = false;
		try
		{
			studentDao.deleteById(id);
			status = true;
		}
		catch(Exception e)
		{
			status = false;
			e.printStackTrace();
		}
		
		return status;
	}
}
