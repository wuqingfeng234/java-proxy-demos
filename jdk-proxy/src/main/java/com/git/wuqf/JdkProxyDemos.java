package com.git.wuqf;

import com.git.wuqf.subject.ISubject;
import com.git.wuqf.subject.ISubject2;
import com.git.wuqf.subject.Subject2Impl;
import com.git.wuqf.subject.SubjectImpl;

/**
 * author wuqf
 * date 2018/11/21
 */
public class JdkProxyDemos {
    public static void main(String[] args) {
        ISubject proxyInstance = (ISubject) new ProxyFactory(new SubjectImpl()).getProxyInstance();
        proxyInstance.doAction("xx");

        ISubject2 proxyInstance2 = (ISubject2) new ProxyFactory(new Subject2Impl()).getProxyInstance();
        proxyInstance2.doAction2("xx");
    }
}
