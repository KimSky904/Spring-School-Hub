package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		//기본생성자 호출
		TestBean obj1 = ctx.getBean("t1",TestBean.class);
		obj1.dataPrn();
		
		//int형 매개변수 1개 있는 생성자 호출
		TestBean obj2 = ctx.getBean("t2",TestBean.class);
		obj2.dataPrn();
		
		//double형 매개변수 1개 있는 생성자 호출
		TestBean obj3 = ctx.getBean("t3",TestBean.class);
		obj3.dataPrn();
		
		//String형 매개변수 1개 있는 생성자 호출
		TestBean obj4 = ctx.getBean("t4",TestBean.class);
		obj4.dataPrn();
		
		TestBean obj5 = ctx.getBean("t5",TestBean.class);
		obj5.dataPrn();
		
		//참조형 1
		TestBean2 obj6 = ctx.getBean("t6",TestBean2.class);
		obj6.dataPrn();
		
		//참조형 2
		TestBean2 obj7 = ctx.getBean("t7",TestBean2.class);
		obj7.dataPrn();
		
		
		
		ctx.close();
		
	}
}