package in.sp.main;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class App 
{
    public static void main( String[] args) throws Exception
    {
//    	String jsonStr = "{\r\n"
//        		+ "	\"id\" : 101,\r\n"
//        		+ "	\"name\" : \"aaa\",\r\n"
//        		+ "	\"gender\" : \"male\",\r\n"
//        		+ "	\"city\" : \"chandigarh\"\r\n"
//        		+ "}";
    	
    	String jsonStr = "[\r\n"
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
    	
    	JsonFactory jsonFactory = new JsonFactory();
    	
    	JsonParser jsonParser = jsonFactory.createParser(jsonStr);
    	while(jsonParser.nextToken() != null)
    	{
    		//System.out.println(jsonParser.currentToken());
    		if(jsonParser.currentToken() == JsonToken.FIELD_NAME)
    		{
    			String fieldName = jsonParser.getCurrentName();
    			jsonParser.nextToken();
    			if(fieldName.equals("id"))
    			{
    				int id = jsonParser.getIntValue();
    				System.out.println("Id : "+id);
    			}
    			else if(fieldName.equals("name"))
    			{
    				String name = jsonParser.getText();
    				System.out.println("Name : "+name);
    			}
    			else if(fieldName.equals("gender"))
    			{
    				String gender = jsonParser.getText();
    				System.out.println("Gender : "+gender);
    			}
    			else if(fieldName.equals("city"))
    			{
    				String city = jsonParser.getText();
    				System.out.println("City : "+city);
    			}
    		}
    		else
    		{
    			System.out.println("----------------------------");
    		}
    	}
    }
}
