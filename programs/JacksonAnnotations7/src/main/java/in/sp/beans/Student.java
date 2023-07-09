package in.sp.beans;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

public class Student
{
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//--------for additional properties-------------
	
	private Map<String, Object> additionalProperties = new HashMap<>();
	
	public void addAdditionalProperty(String key, Object value)
	{
		additionalProperties.put(key, value);
	}
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}
}
