package org.springframework.test.chen.BeanWrapper;

import org.springframework.beans.*;
import org.springframework.core.MethodParameter;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.test.chen.ConversionService.Student;
import org.springframework.test.chen.ConversionService.StudentService;

import java.beans.PropertyDescriptor;
import java.beans.PropertyEditor;
import java.lang.reflect.Field;
import java.util.Map;

/**
 * @Description:
 * @author chenchen
 * @date 2019/10/28 15:28
 */
public class BeanWrapperTest {
	public static void main(String[] args) {
		BeanWrapper beanWrapper = new BeanWrapperImpl(new StudentService());
		beanWrapper.setPropertyValue("name", "chen");
		PropertyValue value = new PropertyValue("age", "100");
		beanWrapper.setPropertyValue(value);

		StudentService result = (StudentService)beanWrapper.getWrappedInstance();
		System.out.println(result.getName());
		System.out.println(result.getAge());
	}
}
