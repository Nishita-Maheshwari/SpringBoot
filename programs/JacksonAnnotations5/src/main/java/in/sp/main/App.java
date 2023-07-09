package in.sp.main;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.sp.beans.Student;

public class App 
{
    public static void main( String[] args) throws Exception
    {
    	String jsonStr = "{\"id\":101,\"name\":\"deepak\",\"password\":\"deepak123\",\"phoneno\":\"6283830308\"}\r\n"
    			+ "";
    	
    	ObjectMapper mapper = new ObjectMapper();
    	Student std = mapper.readValue(jsonStr, Student.class);
    	System.out.println(std.getId());
    	System.out.println(std.getName());
    }
}
