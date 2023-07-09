package in.sp.beans;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Student
{
	private int id;
	private String name;
	@JsonFormat(pattern = "dd/MM/yyyy")
	//@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", timezone = "Asia/Kolkata")
	private Date dob;
	
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
	//@JsonFormat(pattern = "dd/MM/yyyy")
	public Date getDob() {
		return dob;
	}
	@JsonFormat(pattern = "dd/MM/yyyy")
	public void setDob(Date dob) {
		this.dob = dob;
	}
}
