package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// implementing lifecycle method using annotation.
// config.xml
/*
@PostConstruct:- init
@PreDestroy:- destroy.
 */
public class S3 {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public S3() {
    }


    @Override
    public String toString() {
        return "S3{" +
                "subject='" + subject + '\'' +
                '}';
    }

    @PostConstruct
    public void init()
    {
        System.out.println("Inside init :- this is init method");
    }
    /*
    initially these annotations are disabled.
    To enable them go in config5.xml file

     */
    @PreDestroy
    public void end()
    {
        System.out.println("Inside end :- this is destroy method");
    }
}
