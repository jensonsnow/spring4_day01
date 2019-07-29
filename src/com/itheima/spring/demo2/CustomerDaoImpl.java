package com.itheima.spring.demo2;

public class CustomerDaoImpl implements CustomerDao {
	
	 

	
	public void setup() {
		System.out.println("CustomerDaoImpl被初始化了....");
	}
	
	public void destory() {
		System.out.println("CustomerDaoImpl被销毁了....");
	}


	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("CustomerDaoImpl执行了....");
	}

}
