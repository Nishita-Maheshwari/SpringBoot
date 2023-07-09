package in.sp.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.sp.main.beans.Student;

@Controller
public class MyController
{
	@GetMapping("/")
	public String printOnJsp(Model model)
	{
		Student std = null;
		try
		{
			String json = "{\r\n"
	        		+ "	\"id\" : 101,\r\n"
	        		+ "	\"name\" : \"aaa\",\r\n"
	        		+ "	\"gender\" : \"male\",\r\n"
	        		+ "	\"city\" : \"chandigarh\"\r\n"
	        		+ "}";

			ObjectMapper objectMapper = new ObjectMapper();
			
			std = objectMapper.readValue(json, Student.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		model.addAttribute("model_std", std);
		return "index";
	}
}
