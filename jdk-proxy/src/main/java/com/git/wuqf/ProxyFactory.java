package com.git.wuqf;

import java.lang.reflect.Proxy;

/**
 * 代理工厂类，生成特定类的代理对象
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * the proxy factory is binded to proxy defination here.
     *
     * @return delegated object
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new DynamicProxy(target));

    }
}
