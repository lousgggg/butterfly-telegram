package com.luo.wiley.springbootdemo.proxy.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

/**
 * JDK代理要求被代理的类必须实现接口，有很强的局限性
 *
 * 而CGLIB动态代理则没有此类强制性要求。简单的说，CGLIB会让生成的代理类继承被代理类，并在代理类中对代理方法进行强化处理
 * （前置、后置处理等）
 * 总结一下CGLIB在进行代理的时候都进行了哪些工作
 *      生成的代理类继承被代理类。在这里我们需要注意一点：如果委托类被final修饰，那么它不可被继承，即不可被代理；同样，如果
 *          委托类中存在final修饰的方法，那么该方法也不可被代理
 *      代理类会为委托方法生成两个方法，一个是与委托方法签名相同的方法，它在方法中会通过super调用委托方法；另一个是代理类独有
 *          的方法
 *      当执行代理对象的方法时，会首先判断一下是否存在实现了MethodInterceptor接口的CGLIB$CALLBACK_0;如果存在，则将调用
 *              MethodInterceptor中的intercept方法
 * 在intercept方法中，我们除了会调用委托方法，还会进行一些增强操作。在Spring AOP中，典型的应用场景就是在某些敏感方法执行前后
 *      进行操作日志记录
 *
 * 在CGLIB中，方法的调用并不是通过反射来完成的，而是直接对方法进行调用：通过FastClass机制对Class对象进行特别的处理，比如将会
 *      用数组保存method的引用，每次调用方法的时候都是通过一个index下标来保持对方法的引用
 */
public class Client {
    public static void main(String[] args) {
        //代理类class文件存入本地磁盘方便我们反编译查看源码
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D://code");
        //通过CGLIB动态代理获取代理对象的过程
        Enhancer enhancer = new Enhancer();
        //设置enhancer对象的父类
        enhancer.setSuperclass(HelloService.class);
        //设置enhancer的回调对象
        enhancer.setCallback(new MyMethodInterceptor());
        //创建代理对象
        HelloService proxy = (HelloService) enhancer.create();
        //通过代理对象调用目标方法
        proxy.sayHello();
    }
}
