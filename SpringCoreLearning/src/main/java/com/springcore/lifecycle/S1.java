package com.springcore.lifecycle;
// initalize through property injection.
// config 5
public class S1 {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting property");
        this.price = price;
    }

    public S1(double price) {
        this.price = price;
    }

    public S1() {
    }

    @Override
    public String toString() {
        return "S1{" +
                "price=" + price +
                '}';
    }

   //  public void init()
    public void hey()
    {
        System.out.println("Changing the name of init");
        System.out.println("Inside init");
    }
    public void bye()
    // public void destroy()
    {
        System.out.println("Changed the name of destroy");
        System.out.println("Inside destroy");
    }
}

