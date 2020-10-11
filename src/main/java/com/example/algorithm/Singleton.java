package com.example.algorithm;

/**
 * 	单例模式的关键有两点：
    1.构造方法为私有，这样外界就不能随意调用。
    2.get的方法为静态，由类直接调用
 *
 *饿汉式  预先加载法
 */
public class Singleton {
    public static Singleton singleton = new Singleton();
    private Singleton() {
    }
    public static Singleton getInstance(){
        return singleton;
    }
}



/**
 *懒汉式  延迟加载法
 */
class Singleton2 {
    public static Singleton2 singleton;
    private Singleton2() {
    }
    public static Singleton2 getInstance(){
        if(singleton == null){
            //多线程下延迟加载会导致2个实例
            singleton = new Singleton2();
        }
        return singleton;
    }
}

/**
 *双重效验锁模式  延迟加载法
 * volatile 保证数据的可见性 禁止jvm重排  所有写操作都在读之前
 */
class Singleton3 {
    public volatile static  Singleton3 singleton;
    private Singleton3() {
    }
    public static Singleton3 getInstance(){
        if(singleton == null){
            synchronized(Singleton3.class){
                if(singleton == null){
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }
}

/**
 *静态内部类  延迟加载法
 * 没有sybc枷锁 性能当然高一点  利用java虚拟机类初始化类机制
 *1.遇到new、getstatic、setstatic或者invoke(调用) static这4个字节码指令时
 */
class Singleton4 {
    private Singleton4() {
    }

    private static class Singleton5 {
        private static Singleton4 instance = new Singleton4();;
    }

    public static Singleton4 getInstance(){
        return Singleton5.instance;
    }
}


/**
 *枚举实现
 * 线程安全 只被装载一次
 */
class Resource{
}
enum  EnumSingleton {
    INSTANCE;
    private Resource resource;
    private EnumSingleton(){
         resource = new Resource();
    }
    public Resource getInstance(){
        return resource;
    }
}




