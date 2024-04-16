package com.example.demo6;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//Our class is implementing InitializingBean interface
public class Home implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Home() {
    }

    @Override
    public String toString() {
        return "Home{" +
                "price=" + price +
                '}';
    }

    //init method- after properties set as per rule
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init method");
    }

    //destroy method
    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy method");
    }
}

