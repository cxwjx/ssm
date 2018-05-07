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
			System.out.println("��½�ɹ�");
//			moView.addObject("name", "username");
//			moView.setViewName("index");
			//��¼�ɹ�����user�������õ�HttpSession���÷�Χ����
//            session.setAttribute("user", user);
            //ת����main����
//            moView.setView(new RedirectView("index"));
//            System.out.println(moView.getViewName());
            return "forward:/WEB-INF/view/index.jsp";
		}else {
            //��¼ʧ�ܣ�����ʧ����Ϣ������ת����¼ҳ��
			moView.addObject("message","��¼���������������������");
			moView.setViewName("login");
        }
		return "login";
		
	}
}
