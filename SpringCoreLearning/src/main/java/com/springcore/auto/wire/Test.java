package com.springcore.auto.wire;

import com.springcore.ci.Addition;
import com.springcore.ci.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config6.xml");
        System.out.println("Using byName");
        Emp e1=(Emp) context.getBean("emp1");
        System.out.println(e1);
        System.out.println("Using byType");
        Emp e2=(Emp) context.getBean("emp2");
        System.out.println(e2);
        Emp e3=(Emp) context.getBean("emp3");
        System.out.println(e3);
    }
}
