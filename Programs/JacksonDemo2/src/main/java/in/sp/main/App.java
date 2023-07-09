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
    	String json = "[\r\n"
		    			+ "	{\r\n"
		    			+ "		\"id\" : 101,\r\n"
		    			+ "		\"name\" : \"aaa\",\r\n"
		    			+ "		\"gender\" : \"male\",\r\n"
		    			+ "		\"city\" : \"delhi\"\r\n"
		    			+ "	},\r\n"
		    			+ "	{\r\n"
		    			+ "		\"id\" : 102,\r\n"
		    			+ "		\"name\" : \"bbb\",\r\n"
		    			+ "		\"gender\" : \"female\",\r\n"
		    			+ "		\"city\" : \"pune\"\r\n"
		    			+ "	}\r\n"
		    			+ "]";
    	
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	Student[] std_arr = objectMapper.readValue(json, Student[].class);
    	for(Student std : std_arr)
    	{
    		System.out.println(std.getId()+" - "+std.getName()+" - "+std.getGender()+" - "+std.getCity());
    	}
    }
}
