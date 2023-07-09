package in.sp.main;

import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.sp.beans.Student;

public class App 
{
    public static void main( String[] args) throws Exception
    {
    	String jsonStr = "{\"id\":101,\"name\":\"deepak\",\"gender\":\"male\",\"city\":\"delhi\"}\r\n"
    			+ "";
    	
    	ObjectMapper mapper = new ObjectMapper();
    	Student std = mapper.readValue(jsonStr, Student.class);
    	System.out.println(std.getId());
    	System.out.println(std.getName());
    	
    	Map<String, Object> additionalProperties = std.getAdditionalProperties();
    	for(Map.Entry<String, Object> entry : additionalProperties.entrySet())
    	{
    		//System.out.println(entry.getKey()+" : "+entry.getValue());
    		System.out.println(entry.getValue());
    	}
    }
}
