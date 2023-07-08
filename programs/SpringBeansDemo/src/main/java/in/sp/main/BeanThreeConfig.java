package in.sp.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.BeanThree;

@Configuration
public class BeanThreeConfig
{
	@Bean
	public BeanThree createBeanThreeObject()
	{
		return new BeanThree();
	}
}