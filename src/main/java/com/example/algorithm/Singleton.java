package com.example.algorithm;

/**
 *饿汉式  预先加载法
 */
public class Singleton {
    public static Singleton singleton = new Singleton();
    private Singleton() {
    }
    public Singleton getInstance(){
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
    public Singleton2 getInstance(){
        if(singleton == null){
            //多线程下延迟加载会导致2个实例
            singleton = new Singleton2();
        }
        return singleton;
    }
}








