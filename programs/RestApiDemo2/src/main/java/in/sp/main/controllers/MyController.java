package in.sp.main.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sp.main.beans.Student;

@RestController
public class MyController
{
//	@GetMapping("/printStudent")
//	public Student printStdDetails()
//	{
//		Student std = new Student();
//		std.setName("deepak");
//		std.setGender("male");
//		std.setCity("delhi");
//		
//		return std;
//	}
	
	@GetMapping("/printStudent")
	public Student printStdDetails()
	{
		//Student std = new Student("amit", "male", "banglore");
		
		return new Student("amit", "male", "banglore");
	}
}