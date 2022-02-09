package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext contect= new ClassPathXmlApplicationContext("config8.xml");
        Person p1=contect.getBean("person1",Person.class);
        System.out.println(p1);
        System.out.println("Class of list name :"+p1.getFriends().getClass().getName());
        System.out.println("Class of map name:"+p1.getFees().getClass().getName());
        System.out.println("Class of properties:"+p1.getProps().getClass().getName());
    }
}
