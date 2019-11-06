package org.springframework.test.chen.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author chenchen
 * @date 2019/10/14 12:26
 */
public class Dog {

	private String name;

	private String age;

	private Cat cat;

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
