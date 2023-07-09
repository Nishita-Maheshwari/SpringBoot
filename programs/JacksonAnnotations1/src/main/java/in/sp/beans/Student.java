package in.sp.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student
{
	@JsonProperty("myid")
	private int id;
	
	//@JsonProperty("myname")
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//@JsonProperty("myname")
	public String getName() {
		return name;
	}
	@JsonProperty("myname")
	public void setName(String name) {
		this.name = name;
	}
}
