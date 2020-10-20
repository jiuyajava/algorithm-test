package com.example.decorator装饰器模式;

/**
 *   **** 装饰者模式 https://www.jianshu.com/p/4a530a3c70af
 */

public class DecoratorV2Test {
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc()+" 销售价格:"+aBattercake.cost());

    }
}