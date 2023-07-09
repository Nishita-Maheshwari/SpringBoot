package in.sp.main;

import java.io.InputStream;
import java.net.URL;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class App 
{
    public static void main( String[] args) throws Exception
    {
    	String url = "https://jsonplaceholder.typicode.com/posts";
    	InputStream inputStream = new URL(url).openStream();
    	
    	JsonFactory jsonFactory = new JsonFactory();
    	
    	JsonParser jsonParser = jsonFactory.createParser(inputStream);
    	while(jsonParser.nextToken() != null)
    	{
    		//System.out.println(jsonParser.currentToken());
    		if(jsonParser.currentToken() == JsonToken.FIELD_NAME)
    		{
    			String fieldName = jsonParser.getCurrentName();
    			jsonParser.nextToken();
    			if(fieldName.equals("userId"))
    			{
    				int userId = jsonParser.getIntValue();
    				System.out.println("UserId : "+userId);
    			}
    			else if(fieldName.equals("id"))
    			{
    				int id = jsonParser.getIntValue();
    				System.out.println("Id : "+id);
    			}
    			else if(fieldName.equals("title"))
    			{
    				String title = jsonParser.getText();
    				System.out.println("Title : "+title);
    			}
    			else if(fieldName.equals("body"))
    			{
    				String body = jsonParser.getText();
    				System.out.println("Body : "+body);
    			}
    		}
    		else
    		{
    			System.out.println("----------------------------");
    		}
    	}
    }
}
