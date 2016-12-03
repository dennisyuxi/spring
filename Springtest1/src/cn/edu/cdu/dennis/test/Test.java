package cn.edu.cdu.dennis.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.edu.cdu.dennis.impl.Chinese;
import cn.edu.cdu.dennis.inter.Human;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		Human h1 = (Human) ctx.getBean("american");
		h1.eat();
		h1.walk();
		Chinese cc = new Chinese();
		cc.eat();
	}

}
