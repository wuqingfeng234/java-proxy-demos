package com.git.wuqf.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author wuqf
 * date 2018/11/23
 * description define proxy by cglib
 */
public class CglibProxy implements MethodInterceptor {


    public Object getProxy(Class<?> targetClass) {
        return Enhancer.create(targetClass, this);
    }

    //实现MethodInterceptor接口方法
    public Object intercept(Object proxy, Method method, Object[] args,
                            MethodProxy methodProxy) throws Throwable {
        System.out.println(">> doWhatever start"); // 扩展进行额外的功能操作(如鉴权、计时、日志等)
        //通过代理类调用父类中的方法
        Object result = methodProxy.invokeSuper(proxy, args);
        System.out.println("doWhatever end <<");   // 扩展进行额外的功能操作(如鉴权、计时、日志等)
        return result;
    }

}
