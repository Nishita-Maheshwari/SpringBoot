package in.sp.main;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.sp.beans.Student;

public class App 
{
    public static void main( String[] args) throws Exception
    {
        Student std = new Student();
        std.setId(101);
        std.setName("Deepak Panwar");
        std.setGender("Male");
        std.setCity("Pune");
        
        ObjectMapper mapper = new ObjectMapper();
        String jsonStr = mapper.writeValueAsString(std);
        System.out.println(jsonStr);
    }
}
