package com.git.wuqf.cglib;

import com.git.wuqf.cglib.subject.Subject2Impl;
import com.git.wuqf.cglib.subject.SubjectImpl;

/**
 * @author wuqf
 * date 2018/11/23
 */
public class Main {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        //通过生成子类的方式创建代理类
        SubjectImpl proxyImp = (SubjectImpl) proxy.getProxy(SubjectImpl.class);
        proxyImp.doAction("xx");

        //通过生成子类的方式创建代理类
        Subject2Impl proxyImp2 = (Subject2Impl) proxy.getProxy(Subject2Impl.class);
        proxyImp2.doAction2("xx");
    }

}
