package com.example.Observer观察者模式;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}