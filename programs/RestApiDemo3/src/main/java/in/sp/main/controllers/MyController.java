package in.sp.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.sp.main.beans.Student;
import in.sp.main.services.StudentService;

@RestController
public class MyController
{
	@Autowired
	StudentService studentService;
	
//	@PostMapping("/student")
//	public Student addStudent(@RequestParam("id1") int id,
//								@RequestParam("name1") String name,
//								@RequestParam("gender1") String gender,
//								@RequestParam("city1") String city)
//	{
//		Student std = new Student();
//		std.setId(id);
//		std.setName(name);
//		std.setGender(gender);
//		std.setCity(city);
//		
//		Student student = studentService.addStudent(std);
//		return student;
//	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student std)
	{		
		Student student = studentService.addStudent(std);
		return student;
	}
	
	@GetMapping("/student")
	public List<Student> getAllStudents()
	{
		List<Student> students_list = studentService.getAllStudent();
		return students_list;
	}
	
	@GetMapping("/student/{id1}")
	public Student getStudentDetails(@PathVariable("id1") int id)
	{
		Student std = studentService.getStudentDetails(id);
		return std;
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student std)
	{
		Student student = studentService.updateStudent(std);
		return student;
	}
	
	@DeleteMapping("/student/{id1}")
	public boolean deletStudent(@PathVariable("id1") int id)
	{
		boolean status = studentService.deleteStudent(id);
		return status;
	}
}
