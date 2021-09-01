package com.amane;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

public class MyInvocation implements InvocationHandler {
    private Object obj;

    public MyInvocation(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object passer = method.invoke(obj,args);
        if (passer != null){
            passer = passer+"nbsl";
        }
        System.out.println(passer);
        return passer;
    }
}
