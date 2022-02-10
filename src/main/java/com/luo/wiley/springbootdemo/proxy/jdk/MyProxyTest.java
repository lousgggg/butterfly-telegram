package com.luo.wiley.springbootdemo.proxy.jdk;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * JDK静态代理与JDK动态代理之间有些许相似，比如说都要创建代理类，以及代理类都要实现接口等
 * 不同之处：在静态代理中我们需要对哪个接口和哪个被代理类创建代理类，所以我们在编译前就需要代理类实现与被代理类相同的接口，
 *         并且直接在实现的方法中调用被代理类相应的方法；但是动态代理则不同，我们不知道要针对哪个接口、哪个被代理类创建代理类，
 *         因为它是在运行时被创建的。
 * 总结：JDK静态代理和JDK动态代理的区别：
 *         JDK静态代理是通过直接编码创建的，而JDK动态代理是利用反射机制在运行时创建代理类的。
 * 其实在动态代理中，核心是InvocationHandler。每一个代理的实例都会有一个关联的调用处理程序（InvocationHandler）.对待代理实例进行调用时，
 * 将对方法的调用进行编码并指派到它的调用处理器（InvocationHandler）的invoke方法中
 *
 * 对代理对象实例方法的调用都是通过InvocationHandler中的invoke方法来完成的，而invoke方法会根据传入的代理对象、方法名称以及参数决定调用
 * 代理的哪个方法
 */
public class MyProxyTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //=======第一种=======
        //1.生成$Proxy0的class文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        //2.获取动态代理类
        Class proxyClazz = Proxy.getProxyClass(IHello.class.getClassLoader(), IHello.class);
        //3.获得代理类的构造函数，并传入参数类型InvocationHandler.class
        Constructor constructor = proxyClazz.getConstructor(InvocationHandler.class);
        //4.通过构造函数来创建动态代理对象，将自定义的InvocationHandler实例传入
        IHello iHello = (IHello) constructor.newInstance(new MyInvocationHandler(new HelloImpl()));
        //5.通过代理对象调用目标方法
        iHello.sayHello();

        //========第二种======
        /**
         * Proxy类中还有个将2-4步骤封装好的简便方法来创建动态代理对象
         * 其方法签名为：newProxyInstance(ClassLoader loader, Class<?>[] instance, InvocationHandler)
         */
        IHello iHello1 = (IHello) Proxy.newProxyInstance(IHello.class.getClassLoader(), new Class[]{IHello.class},
                new MyInvocationHandler(new HelloImpl()));//自定义的InvocationHandler
        iHello1.sayHello();
    }
}
