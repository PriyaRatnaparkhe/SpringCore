package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("config1.xml");
        Emp e1=(Emp) context.getBean("emp1");
        System.out.println("Name:"+e1.getName());
        System.out.println("Phones:"+e1.getPhones());
        System.out.println("Address:"+e1.getAddress());
        System.out.println("Courses :"+e1.getCourses());
        System.out.println("Through single value");
        Emp e2=(Emp) context.getBean("emp2");
        System.out.println("Name:"+e2.getName());
        System.out.println("Phones:"+e2.getPhones());
        System.out.println("Address:"+e2.getAddress());
        System.out.println("Courses :"+e2.getCourses());
        System.out.println("Getting the type of List in all the beans");
        System.out.println("List type:"+e1.getPhones().getClass().getName());
    }
}
