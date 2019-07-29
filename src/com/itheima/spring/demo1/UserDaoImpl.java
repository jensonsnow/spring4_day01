package com.itheima.spring.demo1;

public class UserDaoImpl implements UserDao {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserDaoImpl÷¥––¡À...."+name);
	}

}
