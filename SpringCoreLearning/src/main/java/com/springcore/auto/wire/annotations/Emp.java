package com.springcore.auto.wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

// if there are multiple beans of same type and we are trying to use just annotation we will get an exception.
// we use qualifier to deal with this. we will pass the name of bean to qualifier and that object will be injected.
// this qualifier is used with autowired annotation.
// config7.xml
// using @Autowired annotation.
// This annotation can be used over a property, setter method and constructor
// 2 classes are involved. B's object needs to be injected in A
// Employee depends on Address. To implement address here we will use autowiring.
public class Emp {
   @Autowired
   @Qualifier("address11")
    // using property.
    private Address address;

    public Address getAddress() {
        return address;
    }
    // using @AutoWired over setter method
    // @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    public Emp() {
    }
// using constructor
   // @Autowired
    public Emp(Address address) {

        System.out.println("Inside paramaterized constructor");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }

}
