package com.openwebinars.beans;

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
        Mundo m = (Mundo) appContext.getBean("mundo");
        
        System.out.println(m.getSaludo() + "(" + m.getRadio() + " km.)");
        
        ((ConfigurableApplicationContext) appContext).close();
    }
}
