package in.sp.main;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.sp.beans.Student;

public class App 
{
    public static void main( String[] args) throws Exception
    {
    	//----------Object to JSON----------------------
//        Student std = new Student();
//        std.setId(101);
//        std.setName("deepak");
//        
//        ObjectMapper mapper = new ObjectMapper();
//        String jsonStr = mapper.writeValueAsString(std);
//        System.out.println(jsonStr);
        
        //-----------JSON to Object--------------------
    	String jsonStr = "{\"myid\":101,\"myname\":\"deepak\"}";
    	
    	ObjectMapper mapper = new ObjectMapper();
    	Student std = mapper.readValue(jsonStr, Student.class);
    	System.out.println(std.getId());
    	System.out.println(std.getName());
    }
}
