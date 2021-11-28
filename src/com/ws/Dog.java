package com.ws;

public class Dog implements  Animal{


    @Override
    public void eat() {
        System.out.println("狗狗开始吃饭");
    }

    @Override
    public void getName() {
        System.out.println("我是小白，属于狗狗一类的动物");
    }
}
