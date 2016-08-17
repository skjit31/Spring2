package com.sanjeev.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;

import com.sanjeev.domain.User;
import com.sanjeev.service.Address;
import com.sanjeev.service.UserDetail;
import com.sanjeev.service.UserService;

@Controller
public class UserController {
	static ApplicationContext context=null;
	static{
		context = new ClassPathXmlApplicationContext("config.xml");
	}
	
	/*@Autowired
	private UserService userService;*/

	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		 
		//TODO basic way to load config file
		BeanFactory beanFactory1=new XmlBeanFactory(new ClassPathResource("config.xml"));
		BeanFactory beanFactory2=new XmlBeanFactory(new FileSystemResource("/home/projects/java/_eclipse/src/main/resource/config.xml"));
		UserService uservice=(UserService)beanFactory1.getBean("userService");
		 
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
	}
	
/*	@RequestMapping("/request")
	@ResponseBody
	public String requestScope(){
		 System.out.println("###########userService############");
		 System.out.println(userService.toString());
		return "request";
	}*/
	
	@RequestMapping("/test/hibernate")
	@ResponseBody
	public String hibernateDemo(){
		org.hibernate.cfg.Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(new User());
		transaction.commit();
		return "success";
	}

}
