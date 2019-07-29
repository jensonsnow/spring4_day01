package com.itheima.spring.demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo4 {
	
	/**
	 * 属性注入的方式 
	 */
	@Test
	public void demo1() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Car car = (Car) applicationContext.getBean("car");
		System.out.println(car);
	}

	
	/**
	 * set的方式 
	 */
	@Test
	public void demo2() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Car2 car2 = (Car2) applicationContext.getBean("car2");
		System.out.println(car2);
	}

	
	
	/**
	 * p名称空间的方式 
	 */
	@Test
	public void demo3() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee employee = (Employee) applicationContext.getBean("employee");
		System.out.println(employee);
	}

}
