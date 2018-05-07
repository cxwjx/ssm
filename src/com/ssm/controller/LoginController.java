package com.ssm.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.ssm.model.User;
import com.ssm.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("login")
	public String login(@RequestParam("username") String username,  
            @RequestParam("password") String password,Model model) {
		System.out.println("username:"+username);
		System.out.println("password:"+password);
		List<User> user=userService.selectUsers(username);
		ModelAndView moView=new ModelAndView();
		if(password.equals(user.get(0).getPassword())){
			System.out.println("登陆成功");
//			moView.addObject("name", "username");
//			moView.setViewName("index");
			//登录成功，将user对象设置到HttpSession作用范围域中
//            session.setAttribute("user", user);
            //转发到main请求
//            moView.setView(new RedirectView("index"));
//            System.out.println(moView.getViewName());
            return "forward:/WEB-INF/view/index.jsp";
		}else {
            //登录失败，设置失败信息，并调转到登录页面
			moView.addObject("message","登录名和密码错误，请重新输入");
			moView.setViewName("login");
        }
		return "login";
		
	}
}
