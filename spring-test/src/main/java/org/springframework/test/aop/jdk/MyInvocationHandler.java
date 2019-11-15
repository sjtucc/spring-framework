package org.springframework.test.aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("getName")) {
            System.out.println("+++before get name+++");
            Object res = method.invoke(target, args);
            System.out.println("+++after get name+++");
            return res;
        } else {
            Object res = method.invoke(target, args);
            return res;
        }

    }

    public static void main(String[] args) {
		System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        UserService us = new UserServiceImpl();
        InvocationHandler ih = new MyInvocationHandler(us);
        UserService usProxy = (UserService) Proxy.newProxyInstance(us.getClass().getClassLoader(),
                us.getClass().getInterfaces(), ih);
        System.out.println(usProxy.getName(1));
        System.out.println(usProxy.getAge(1));
        System.out.println(usProxy.getClass());
    }

}