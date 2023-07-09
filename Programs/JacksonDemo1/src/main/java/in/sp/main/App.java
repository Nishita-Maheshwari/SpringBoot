package in.sp.main;

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
        String json = "{\r\n"
		        		+ "	\"id\" : 101,\r\n"
		        		+ "	\"name\" : \"aaa\",\r\n"
		        		+ "	\"gender\" : \"male\",\r\n"
		        		+ "	\"city\" : \"chandigarh\"\r\n"
		        		+ "}";
        
        ObjectMapper objectMapper = new ObjectMapper();
        
        Student std = objectMapper.readValue(json, Student.class);
        
        System.out.println("Id : "+std.getId());
        System.out.println("Name : "+std.getName());
        System.out.println("Gender : "+std.getGender());
        System.out.println("City : "+std.getCity());
    }
}
