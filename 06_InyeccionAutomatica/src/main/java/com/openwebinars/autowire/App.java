package com.openwebinars.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/openwebinars/xml/beans.xml");
		
		Cliente c = (Cliente) appContext.getBean("cliente");
		
		System.out.println(c);
		
		((ConfigurableApplicationContext) appContext).close();
    }
}
