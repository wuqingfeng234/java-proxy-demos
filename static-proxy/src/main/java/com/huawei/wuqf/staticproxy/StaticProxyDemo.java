package com.huawei.wuqf.staticproxy;

// 验证代码 //
public class StaticProxyDemo {
    public static void main(String[] args) {
        SubjectProxy subject = new SubjectProxy();
        subject.doAction();
        subject.byebye();
    }
}