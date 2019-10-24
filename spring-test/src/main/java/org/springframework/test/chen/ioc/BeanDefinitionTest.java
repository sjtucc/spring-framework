package org.springframework.test.chen.ioc;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @Description:  XML Resource => XML Document => Bean Definition
 * @author chenchen
 * @date 2019/10/15 10:46
 */
public class BeanDefinitionTest {

	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("spring-config.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
	}
}
