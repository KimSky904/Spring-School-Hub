package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx.getBean("t1",TestBean1.class);
		t1.Print();
	
		
		TestBean2 t2 = ctx.getBean("t2",TestBean2.class);
		t2.Print();
		
		
		TestBean3 t3 = ctx.getBean("t3",TestBean3.class);
		t3.Print();
		
		ctx.close();
	}

}