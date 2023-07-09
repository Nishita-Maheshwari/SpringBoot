package in.sp.beans;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Student
{
	@JsonAlias({"myid", "id1"})
	private int id;
	
	//@JsonAlias({"myname", "name1"})
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//@JsonAlias({"myname", "name1"})
	public String getName() {
		return name;
	}
	@JsonAlias({"myname", "name1"})
	public void setName(String name) {
		this.name = name;
	}
}
