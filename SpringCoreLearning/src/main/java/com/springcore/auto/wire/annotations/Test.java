package com.springcore.auto.wire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config7.xml");
        Emp e1=(Emp) context.getBean("emp1");
        System.out.println(e1);

    }
}
