package com.luo.wiley.springbootdemo.proxy.staticproxy;

/**
 * 使用JDK静态代理很容易就完成了对一个类的代理操作，但是JDK静态代理的缺点也暴露了出来；
 * 由于代理只能为一个类服务，如果需要代理的类很多，那么就需要编写大量的代理类，比较繁琐
 */
public class Main {
    public static void main(String[] args) {
        //新建目标对象
        UserDaoImpl target = new UserDaoImpl();
        //创建代理对象，并使用接口对其进行引用
        UserDao userDao = new TransactionHandler(target);
        //针对接口进行调用
        userDao.save();
    }
}
