package in.sp.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.sp.main.beans.User;
import in.sp.main.service.UserService;

@Controller
public class MyController
{
	@GetMapping("/")
	public String openIndexPage()
	{
		return "index";
	}
	
	@GetMapping("/addUserPage")
	public String openAddUserPage()
	{
		return "adduser-page";
	}
	
	@GetMapping("/deleteUserPage")
	public String deleteUserPage()
	{
		return "deleteuser-page";
	}
	
	@Autowired
	UserService userService;
	
	@PostMapping("/addUserForm")
	public String addUserForm(@RequestParam("name1") String name,
								@RequestParam("email1") String email,
								@RequestParam("gender1") String gender,
								@RequestParam("city1") String city)
	{
		String page="error";
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setGender(gender);
		user.setCity(city);
		
		boolean status = userService.addUser(user);
		if(status)
		{
			page = "success";
		}
		else
		{
			page = "error";
		}
		
		return page;
	}
	
	@PostMapping("/deleteUserForm")
	public String deleteUser(@RequestParam("id1") int id)
	{
		String page = "error";
		
		boolean status = userService.deleteUser(id);
		if(status)
		{
			page = "success";
		}
		else
		{
			page = "fail";
		}
		
		return page;
	}
}