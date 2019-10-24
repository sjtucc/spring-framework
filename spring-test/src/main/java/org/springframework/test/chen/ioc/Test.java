package org.springframework.test.chen.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @author chenchen
 * @date 2019/10/14 12:27
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("spring-config.xml");
		Dog myTestBean= (Dog) app.getBean("myTestBean");
		System.out.println(111);
		System.out.println(myTestBean.hashCode());
		System.out.println(222);
	}
}
