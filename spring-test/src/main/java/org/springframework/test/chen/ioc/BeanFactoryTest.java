package org.springframework.test.chen.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @author chenchen
 * @date 2019/10/15 13:33
 */
public class BeanFactoryTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
		Animal animal = (Animal) applicationContext.getBean("animalFcatoryBean");
		animal.playAnimal();
	}
}
