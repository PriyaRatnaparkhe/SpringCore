package com.springcore.auto.wire;
// config6.xml

// 2 classes ate involved. B's object needs to be injected in A
// Employee depends on Address. To implement address here we will use autowiring.
public class Emp {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Emp() {
    }

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
