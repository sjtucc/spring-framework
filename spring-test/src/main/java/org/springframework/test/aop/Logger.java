package org.springframework.test.aop;
/**
 * @Description:
 * @author chenchen
 * @date 2019/11/6 15:00
 */
public class Logger {
	public void recordBefore(){
		System.out.println("recordBefore");
	}

	public void recordAfter(){
		System.out.println("recordAfter");
	}
}
