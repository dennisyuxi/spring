package cn.edu.cdu.dennis.impl;

import cn.edu.cdu.dennis.inter.Human;

public class Chinese implements Human {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("中国美食");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("高铁");
	}

}
