package com.example.Adapter适配器模式;

/**
 *  **** 适配器模式（Adapter Pattern）- 最易懂的设计模式解析 适配器模式原理及实例介绍
 *  https://www.jianshu.com/p/9d0575311214
 */
public class AdapterPattern {

    public static void main(String[] args){
        //类适配器模式：适配器与适配者之间是继承（或实现）关系。
        Target mAdapter = new Adapter();
        mAdapter.Request();

        //对象适配器模式：适配器与适配者之间是关联(委派)关系
        //需要先创建一个被适配类的对象作为参数
        Target mAdapter2 = new Adapter2(new Adaptee());
        mAdapter2.Request();

    }
}