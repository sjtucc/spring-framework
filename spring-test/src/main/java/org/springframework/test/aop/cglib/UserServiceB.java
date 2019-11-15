package org.springframework.test.aop.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.io.IOException;
import java.lang.reflect.Method;

public class UserServiceB {
    public String getName(int id) {
        System.out.println("---getName---");
        return "John";
    }
    public Integer getAge(int id) {
        System.out.println("---getAge---");
        return 10;
    }
    public static void main(String[] args) throws InterruptedException, IOException {
    //将cglib生成的Class对象写成文件存入硬盘，后面反编译出来用以分析
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\class");
        UserServiceB us = new UserServiceB();
        // 定义增强器
        Enhancer en = new Enhancer();
        // 定义要代理的对象
        en.setSuperclass(us.getClass());
        // 定义回调函数
        en.setCallback(new MethodInterceptor() {
            //这里要理解intercept方法的几个参数代表的意思
            //obj指的是代理类对象
            //Method指的是 目标类中被拦截的方法
            //args指的是 调用拦截方法所需的参数
            //MethodProxy指的是用来调用目标类被拦截方法的方法，这个方法比反射更快
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy)
                    throws Throwable {
                System.out.println("-----before-------");
                //这里只能用invokeSuper，原因稍后解释
                methodProxy.invokeSuper(obj, args);
                System.out.println("-----after--------");
                return null;
            }

        });
        // 生成代理对象
        UserServiceB usb = (UserServiceB) en.create();
        // 在代理对象上调用方法
        usb.getName(1);

    }

}