package in.sp.beans;

// this bean will be created using spring xml configuration

public class BeanOne 
{
	private String nameone;

	public String getNameone() {
		return nameone;
	}

	public void setNameone(String nameone) {
		this.nameone = nameone;
	}
	
	public void displayBeanOneName()
	{
		System.out.println("Bean 1 : "+nameone);
	}
}
