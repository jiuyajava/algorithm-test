package com.example.proxy;

/**
 *  详解 Java 中的三种代理模式  https://www.cnblogs.com/leeego-123/p/11902418.html
 * 测试类
 */
public class App {
    public static void main(String[] args) {
        //静态代理
        //目标对象
        UserDao target1 = new UserDao();
        //代理对象,把目标对象传给代理对象,建立代理关系
        UserDaoProxy proxy1 = new UserDaoProxy(target1);
        proxy1.save();//执行的是代理的方法



        //动态代理
        // 目标对象
//        IUserDao target = new UserDao();
//        // 【原始的类型 class cn.itcast.b_dynamic.UserDao】
//        System.out.println(target.getClass());
//        // 给目标对象，创建代理对象
//        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
//        // class $Proxy0   内存中动态生成的代理对象
//        System.out.println(proxy.getClass());
//        // 执行方法   【代理对象】
//        proxy.save();


        //Cglib子类代理工厂
        //目标对象
//        CglibUserDao target3 = new CglibUserDao();
//        //代理对象
//        CglibUserDao proxy3 = (CglibUserDao) new CglibProxyFactory(target3).getProxyInstance();
//        //执行代理对象的方法
//        proxy3.save();
    }
}