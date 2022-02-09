package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
// congig5.xlm
// implementing lifecycle methods using interfaces
public class S2 implements InitializingBean , DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "S2{" +
                "price=" + price +
                '}';
    }

    public S2() {

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("In init");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("On destory");
    }
}
