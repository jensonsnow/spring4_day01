package com.itheima.spring.demo2;

public class CustomerDaoImpl implements CustomerDao {
	
	 

	
	public void setup() {
		System.out.println("CustomerDaoImpl����ʼ����....");
	}
	
	public void destory() {
		System.out.println("CustomerDaoImpl��������....");
	}


	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("CustomerDaoImplִ����....");
	}

}
