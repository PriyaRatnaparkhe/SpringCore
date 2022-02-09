package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config4.xml");
        Person p1=(Person) context.getBean("person");
        System.out.println("Printing the first object");
        System.out.println(p1);
        System.out.println("Printing the secod object");
        Person p2=(Person) context.getBean("person2");
        System.out.println(p2);
        System.out.println("Prinitng 3 rd object , injectingn object reference using constuructor dependecy");
        Person p3=(Person) context.getBean("person3");
        System.out.println(p3);
        System.out.println("Addition class");
        Addition a1=(Addition) context.getBean("add");
        a1.doSum();
        System.out.println("Second bean of addition class");
        Addition a2=(Addition) context.getBean("add1");
        a2.doSum();
    }
}
