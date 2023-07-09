package in.sp.main;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.sp.beans.Student;

public class App 
{
    public static void main( String[] args) throws Exception
    {
//    	---------------write----------------
//        Student std = new Student();
//        std.setId(101);
//        std.setName("Deepak Panwar");
//        std.setGender("Male");
//        std.setCity("Pune");
//        
//        Map<String, Object> map = new HashMap<>();
//        map.put("student", std);
//        
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.writeValue(new File("D:\\student.json"), map);
//        System.out.println("success");
    	
    	
//    	---------------read------------------
    	ObjectMapper mapper = new ObjectMapper();
    	Map<String, Object> map = mapper.readValue(new File("D:\\student.json"), Map.class);
    	System.out.println(map.get("student"));
    }
}
