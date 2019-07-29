package com.itheima.spring.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo1 {
	
	@Test
	public void demo1() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDao");
		customerDao.save();
		applicationContext.close();
	}
	
	
	 

}
