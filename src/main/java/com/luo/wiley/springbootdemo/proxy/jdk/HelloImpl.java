package com.luo.wiley.springbootdemo.proxy.jdk;

public class HelloImpl implements IHello{
    @Override
    public void sayHello() {
        System.out.println("Hello world!");
    }
}
