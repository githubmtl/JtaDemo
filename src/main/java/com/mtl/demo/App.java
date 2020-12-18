package com.mtl.demo;

import com.mtl.demo.jta.service.UserServiceIf;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext abstractApplicationContext=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserServiceIf userService = abstractApplicationContext.getBean(UserServiceIf.class);
        userService.test();
        abstractApplicationContext.close();
    }
}
