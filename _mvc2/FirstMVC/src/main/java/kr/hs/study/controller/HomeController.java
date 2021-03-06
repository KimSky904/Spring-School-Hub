package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value="/",method=RequestMethod.GET)
	// GET방식으로 Root(/)에 접속했을 때 아래 메소드(home)를 실행해라
	public String home() {
		System.out.println("home");
		return "index";
	}
	@RequestMapping(value="/test",method=RequestMethod.GET)
	// GET방식으로 test(/test)에 접속했을 때 아래 메소드(test)를 실행해라
	public String test() {
		System.out.println("test");
		return "test";
	}
}
