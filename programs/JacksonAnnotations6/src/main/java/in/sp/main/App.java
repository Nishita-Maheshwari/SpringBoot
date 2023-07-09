package in.sp.main;

import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.sp.beans.Student;

public class App 
{
    public static void main( String[] args) throws Exception
    {
    	Student std = new Student();
    	std.setId(101);
    	std.setName("deepak");
    	std.setDob(new Date());
    	
    	ObjectMapper mapper = new ObjectMapper();
    	String jsonStr = mapper.writeValueAsString(std);
    	System.out.println(jsonStr);
    }
}
