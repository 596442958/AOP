package com.miles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = (User)ctx.getBean("user");
        user.GetUser("Miles");
        user.GetAge(21);
    }
}
