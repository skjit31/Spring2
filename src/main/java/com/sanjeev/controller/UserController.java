package com.sanjeev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;

import com.sanjeev.service.Address;
import com.sanjeev.service.UserDetail;
import com.sanjeev.service.UserService;

@Controller
public class UserController {
	static ApplicationContext context=null;
	static{
		context = new ClassPathXmlApplicationContext("config.xml");
	}
	
	@Autowired
	private UserService userService1;

/*	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		 
		 
		 UserService service=context.getBean("userService",UserService.class);
		 System.out.println("###########userService############");
		 System.out.println(service.toString());
		 
		 UserDetail userDetail=context.getBean("userDetail",UserDetail.class);
		 System.out.println("###########userDetail############");
		 System.out.println(service.toString());
		 
		 Address address=context.getBean("address",Address.class);
		 System.out.println("###########address############");
		 System.out.println(address.toString());
		return "hello";
	}*/
	
	@RequestMapping("/request")
	@ResponseBody
	public String requestScope(){
		 System.out.println("###########userService############");
		 System.out.println(userService1.toString());
		return "request";
	}

}
