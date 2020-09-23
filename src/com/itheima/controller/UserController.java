package com.itheima.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itheima.po.User;
import com.itheima.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register()
	{
		return "register";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(User u,Model model,HttpSession session)
	{
		int row=userService.insertUser(u);
		System.out.println(u.getId());	
		if(row>0)
		return "success";
		else
		return "error";
	}
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login()
	{
		return "login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(User u,Model model,HttpSession session)
	{
		User us=userService.isLogin(u);
		if(us!=null)
		{	
		    session.setAttribute("name", "ук╨е:"+us.getName());
		    session.setAttribute("User", us);
		    return "main";
		}
		else
			return "error";
	}
	
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public String main()
	{
		return "main";
	}
	
}
