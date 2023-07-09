package in.sp.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.sp.main.beans.Student;
import in.sp.main.service.LoginService;

@Controller
public class MyController
{
	@GetMapping("/")
	public String openIndexPage()
	{
		return "index";
	}
	
	@GetMapping("/loginPage")
	public String openLoginPage()
	{
		return "login";
	}
	
	@Autowired
	LoginService loginService;
	
	@PostMapping("/loginForm")
	public String login(@RequestParam("email1") String email, @RequestParam("pass1") String password, Model model)
	{
		String page = "error";
		
		List<Student> students_list = loginService.loginService(email, password);
		if(students_list.size() != 0)
		{
			model.addAttribute("model_student", students_list.get(0));
			page = "profile";
		}
		else
		{
			page = "error";
		}
		return page;
	}
}
