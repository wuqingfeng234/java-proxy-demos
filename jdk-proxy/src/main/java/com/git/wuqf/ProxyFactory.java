package com.git.wuqf;
/**
 *
 *代理工厂类，生成特定类的代理对象
*/
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(HelloImpl.class.getClassLoader(),
                HelloImpl.class.getInterfaces(),
                new DynamicProxy(new HelloImpl()));

    }
}
