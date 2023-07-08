package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.BeanOne;
import in.sp.beans.BeanThree;
import in.sp.beans.BeanTwo;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
        
        //----------get all created beans id and class name---------------------------
//        String[] allBeanNames = context.getBeanDefinitionNames();
//        for(String beanDef : allBeanNames)
//        {
//        	System.out.println("Bean Id : "+beanDef);
//        	System.out.println("Bean Class : "+context.getBean(beanDef).getClass().toString());
//        	System.out.println("---------------------------------------------------------------------");
//        }
        
        BeanOne beanOne = (BeanOne) context.getBean("beanOneId");
        beanOne.displayBeanOneName();
        
        BeanTwo beanTwo = (BeanTwo) context.getBean("beanTwo");
        beanTwo.displayBeanTwoName();
        
        BeanThree beanThree = (BeanThree) context.getBean("createBeanThreeObject");
        beanThree.displayBeanThreeName();
    }
}
