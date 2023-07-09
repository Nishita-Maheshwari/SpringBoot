package in.sp.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.sp.main.beans.User;
import in.sp.main.services.UserService;

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
	
	@GetMapping("/updateUserPage")
	public String openUpdateUserPage()
	{
		return "updateuser-page";
	}
	
	@GetMapping("/deleteUserPage")
	public String openDeleteUserPage()
	{
		return "deleteuser-page";
	}
	
	@GetMapping("/searchUserPage")
	public String openSearchUserPage()
	{
		return "searchuser-page";
	}
	
	@Autowired
	UserService userService;
	
	@PostMapping("/addUserForm")
	public String addUserForm(
								@RequestParam("name1") String name,
								@RequestParam("email1") String email,
								@RequestParam("gender1") String gender,
								@RequestParam("city1") String city
							  )
	{
		String page = "error";
		
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
	
	@PostMapping("/updateUserForm")
	public String updateUserForm(
			@RequestParam("name1") String name,
			@RequestParam("email1") String email,
			@RequestParam("gender1") String gender,
			@RequestParam("city1") String city
			)
	{
		String page = "error";
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setGender(gender);
		user.setCity(city);
		
		boolean status = userService.updateUser(user);
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
	public String deleteUserForm(@RequestParam("email1") String email)
	{
		String page = "error";
		
		boolean status = userService.deleteUser(email);
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
	
	@PostMapping("/searchUserForm")
	public String searchUserForm(@RequestParam("email1") String email, Model model)
	{
		String page = "error";
		
		User user = userService.searchUser(email);
		if(user != null)
		{
			model.addAttribute("model_user", user);
			page = "user-details";
		}
		else
		{
			page = "error";
		}
		
		return page;
	}
	
	@GetMapping("/getAllUsersPage")
	public String getAllUsers(Model model)
	{
		String page = "get-allusers";
		
		List<User> users_list = userService.getAllUsers();
		model.addAttribute("model_allusers", users_list);
		
		return page;
	}
}
