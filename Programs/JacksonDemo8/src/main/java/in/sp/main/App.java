package in.sp.main;

import java.io.File;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

public class App 
{
    public static void main( String[] args) throws Exception
    {
    	JsonFactory jsonFactory = new JsonFactory();
    	
    	JsonGenerator jsonGenerator = jsonFactory.createGenerator(new File("D:\\student.json"), JsonEncoding.UTF8);
    	
    	jsonGenerator.writeStartObject();
    	
    	jsonGenerator.writeNumberField("id", 101);
    	jsonGenerator.writeStringField("name", "Amit Chaudhary");
    	jsonGenerator.writeStringField("gender", "Male");
    	jsonGenerator.writeStringField("city", "Chandigarh");
    	
    	
    	jsonGenerator.writeFieldName("marks");
    	jsonGenerator.writeStartArray();
	    	jsonGenerator.writeNumber(89);
	    	jsonGenerator.writeNumber(82);
	    	jsonGenerator.writeNumber(93);
	    jsonGenerator.writeEndArray();
    	
    	jsonGenerator.writeEndObject();
    	jsonGenerator.close();
    	
    	System.out.println("success");
    }
}
