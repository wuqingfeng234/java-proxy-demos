package com.huawei.wuqf.staticproxy;

// 真实对象(委托类) //
public class RealSubject implements ISubject {
    @Override
    public void doAction() { System.out.println("Real Action Here!"); }
    @Override
    public void byebye() { System.out.println("Wave goodbye!"); }
}