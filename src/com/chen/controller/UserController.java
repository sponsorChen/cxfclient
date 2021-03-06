package com.chen.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chen.domain.User;
import com.chen.service.UserService;
import com.chen.webservice.HelloWorld;



@Controller
@RequestMapping("/user")
public class UserController {
	private static Logger logger=Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@Resource(name="helloWorld")
	private HelloWorld helloWorld;
	
	@RequestMapping("/getUser")
	@ResponseBody
	public User getUser(HttpServletRequest request,HttpServletResponse response)
	{
		return userService.getUser();
	}
	
	@RequestMapping("/gethello")
	@ResponseBody
	public String gethello(HttpServletRequest request,HttpServletResponse response)
	{
		return helloWorld.sayHello("beijing");
	}
	

}
