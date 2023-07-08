package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanTwo
{
	@Value("Kamal Sharma")
	private String nametwo;

	public String getNametwo() {
		return nametwo;
	}

	public void setNametwo(String nametwo) {
		this.nametwo = nametwo;
	}
	
	public void displayBeanTwoName()
	{
		System.out.println("Bean 2 : "+nametwo);
	}
}