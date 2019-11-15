package org.springframework.test.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @author chenchen
 * @date 2019/11/6 15:04
 */
public class TestAop {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");//BeanDefination的解析注册，代理对象的生成
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");//可以看到userDao类型是以$Proxy开头的，说明是通过JDK动态代理的方式获取的
		userDao.addUser();//增强行为发生的时刻
	}
}
