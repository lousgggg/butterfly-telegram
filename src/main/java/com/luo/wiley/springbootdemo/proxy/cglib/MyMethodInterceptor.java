package com.luo.wiley.springbootdemo.proxy.cglib;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 自定义的MethodInterceptor
 */
public class MyMethodInterceptor implements MethodInterceptor {

    /**
     * sub:cglib生成的代理对象
     * method:被代理对象方法
     * objects:方法入参
     * methodProxy:代理方法
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("====插入前置通知====");
        Object object = methodProxy.invoke(o, objects);
        System.out.println("====插入后置通知");
        return object;
    }
}
