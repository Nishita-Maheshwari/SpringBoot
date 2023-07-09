package in.sp.main.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class MyController
//{
//	@GetMapping("/")
//	public String printHello()
//	{
//		return "hello deepak";
//	}
//	
//	@PostMapping("/")
//	public String printHi()
//	{
//		return "hi deepak";
//	}
//}



//@RestController
//public class MyController
//{
//	@PostMapping("/")
//	public String printHello(@RequestParam("name1") String name)
//	{
//		return "hello : "+name;
//	}
//	
//	@GetMapping("/hi")
//	public String printHi(@RequestParam("name1") String name, @RequestParam("rollno1") String rollno)
//	{
//		return "hi : "+name+", your rollno is "+rollno;
//	}
//}




@RestController
public class MyController
{
	@GetMapping("/hello/{name1}")
	public String printHello(@PathVariable("name1") String name)
	{
		return "hello : "+name;
	}
	
	@PostMapping("/hi/{name1}/{rollno1}")
	public String printHi(@PathVariable("name1") String name, @PathVariable("rollno1") String rollno)
	{
		return "hi "+name+", your rollno is "+rollno;
	}
}