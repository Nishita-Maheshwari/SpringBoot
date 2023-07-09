package in.sp.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Student
{
	private int id;
	private String name;
	
	//@JsonIgnore
	private String password;
	
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
	
	//@JsonIgnore
	public String getPassword() {
		return password;
	}
	@JsonIgnore
	public void setPassword(String password) {
		this.password = password;
	}
}
