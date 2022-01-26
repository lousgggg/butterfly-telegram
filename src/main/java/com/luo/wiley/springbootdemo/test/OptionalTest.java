package com.luo.wiley.springbootdemo.test;

import lombok.Data;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        TestClass testClass = null;
        testClass = new TestClass("hello");
//        testClass.getName(); // NullPointerException

        String name = Optional.ofNullable(testClass).map(TestClass::getName).orElse("name is null");
        System.out.println(name);
    }
}

@Data
class TestClass {
    private String name = "";

    public TestClass(String name) {
        this.name = name;
    }
}
