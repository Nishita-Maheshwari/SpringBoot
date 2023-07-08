package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;

public class BeanThree
{
	@Value("Amit Chaudhary")
	private String namethree;

	public String getNamethree() {
		return namethree;
	}

	public void setNamethree(String namethree) {
		this.namethree = namethree;
	}
	
	public void displayBeanThreeName()
	{
		System.out.println("Bean 3 : "+namethree);
	}
}
