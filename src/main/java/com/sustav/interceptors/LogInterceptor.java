package com.sustav.interceptors;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@ConsoleLog
public class LogInterceptor {
    @AroundInvoke
    public Object log(InvocationContext ic) throws Exception {
        System.out.println("Invocation method: " + ic.getMethod().getName());
        return ic.proceed();
    }
}
