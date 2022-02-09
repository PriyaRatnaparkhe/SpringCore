package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        System.out.println("Setting value using value as a tag");
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        Student s1=(Student) context.getBean("Student1");
        System.out.println(s1);
        System.out.println("Setting value using value as a attribute");
        Student s2=(Student) context.getBean("Student2");
        System.out.println(s2);
    }
}
