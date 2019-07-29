package com.itheima.spring.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo1 {
	
	@Test
	public void demo1() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		userDao.save();
	}
	
	
	
	/**
	 * 加载本地配置文件
	 */
	@Test
	public void demo2() {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("C:\\ApplicationContext.xml");
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		userDao.save();
	}

}
