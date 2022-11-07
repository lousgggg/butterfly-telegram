package com.luo.wiley.springbootdemo.proxy.staticproxy;

public class TransactionHandler implements UserDao{

    //目标代理对象
    private UserDao target;

    //构造代理对象时传入目标对象
    public TransactionHandler(UserDao target) {
        this.target = target;
    }

    @Override
    public void save() {
        //调用目标方法前的处理
        System.out.println("开启事务控制...");
        //调用目标对象的方法
        target.save();
        //调用目标方法后的处理
        System.out.println("关闭事务控制...");
    }
}