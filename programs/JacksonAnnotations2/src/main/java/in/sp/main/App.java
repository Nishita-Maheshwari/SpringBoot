package in.sp.main;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.sp.beans.Student;

public class App 
{
    public static void main( String[] args) throws Exception
    {
    	//String jsonStr= "{\"id\":101,\"name\":\"deepak\"}";
    	//String jsonStr= "{\"myid\":101,\"myname\":\"deepak\"}";
    	String jsonStr= "{\"id1\":101,\"name1\":\"deepak\"}";
    	
    	ObjectMapper mapper = new ObjectMapper();
    	Student std = mapper.readValue(jsonStr, Student.class);
    	System.out.println(std.getId());
    	System.out.println(std.getName());
    }
}
