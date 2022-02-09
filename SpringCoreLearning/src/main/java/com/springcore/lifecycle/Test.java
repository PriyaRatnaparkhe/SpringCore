package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("config5.xml");
        context.registerShutdownHook();
        S1 s=(S1)context.getBean("s1");
        System.out.println(s);
        // we need to enable a pre shutdown hook for calling destroy.
        // pres shutdown method hook can be used to get the method for ragistering shut-down hook
        // ragisteting shut down hook
        System.out.println("Lifecycle methods using interfaces");
        S2 s2=(S2) context.getBean("s2");
        System.out.println(s2);
        //order of  execution of lifecycle method in bean is fixed.
        System.out.println("Lifecycle methods using annotations");
        S3 s3=(S3) context.getBean("s3");
        System.out.println(s3);
    }
}
