package com.luo.wiley.springbootdemo.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lsgem
 */
public class AOP_Impl implements InvocationHandler {

    private Object targetObject;

    public AOP_Impl(Object targetObject) {
        this.targetObject = targetObject;
    }

    /**
     * 关联的这个实现类方法被调用时将被执行
     * InvocationHandler接口的方法， proxy表示代理， method表示原对象被调用的方法，
     *        args表示方法的参数
     * @param proxy
     * @param method
     * @param args
     * @return
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        Object ret = null;
        try {
            System.out.println("方法之前：" + System.currentTimeMillis());
            //调用目标方法
            ret = method.invoke(targetObject, args);
            System.out.println("方法之后：" + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }
         return ret;
    }
}
