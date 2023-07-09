package in.sp.main;

import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App 
{
    public static void main( String[] args) throws Exception
    {
        String jsonStr = "{\r\n"
			        		+ "	\"id\" : 101,\r\n"
			        		+ "	\"name\" : \"aaa\",\r\n"
			        		+ "	\"gender\" : \"male\",\r\n"
			        		+ "	\"city\" : \"chandigarh\"\r\n"
			        		+ "}";
        
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> map = mapper.readValue(jsonStr, new TypeReference<Map<String, Object>>(){});
        System.out.println(map);
    }
}
