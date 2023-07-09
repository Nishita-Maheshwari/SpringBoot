package in.sp.main;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.sp.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
//    	--------------write data in json file-------------------------------
//    	Student std = new Student();
//    	std.setId(101);
//    	std.setName("deepak panwar");
//    	std.setGender("male");
//    	std.setCity("banglore");
//    	
//    	ObjectMapper objectMapper = new ObjectMapper();
//    	objectMapper.writeValue(new File("D:\\student.json"), std);
    	
    	
    	//--------------read data from json file-------------------------------
    	ObjectMapper objectMapper = new ObjectMapper();
    	Student std = objectMapper.readValue(new File("D:\\student.json"), Student.class);
    	System.out.println("Id : "+std.getId());
    	System.out.println("Name : "+std.getName());
    	System.out.println("Gender : "+std.getGender());
    	System.out.println("City : "+std.getCity());
    }
}