package org.sun.h2.db.util;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import org.sun.h2.db.core.DBMethodInterceptor;

public class AOPUtils {

    public static final <T> T createProxy(Class<T> clazz,MethodInterceptor interceptor) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new DBMethodInterceptor(interceptor));

        return (T) enhancer.create();
    }

    public static final <T> T createProxy(Class<T> clazz,Class[] paramsClass,Object[] params,MethodInterceptor interceptor) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new DBMethodInterceptor(interceptor));
        return (T) enhancer.create(paramsClass,params);
    }

}
