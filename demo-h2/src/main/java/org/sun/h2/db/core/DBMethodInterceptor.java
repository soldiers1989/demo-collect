package org.sun.h2.db.core;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public final class DBMethodInterceptor implements MethodInterceptor {

    private MethodInterceptor interceptor;

    public DBMethodInterceptor(MethodInterceptor interceptor){
        this.interceptor = interceptor;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if(method.isBridge()){
           return methodProxy.invokeSuper(o,objects);
        }
        return interceptor.intercept(o,method,objects,methodProxy);
    }
}
