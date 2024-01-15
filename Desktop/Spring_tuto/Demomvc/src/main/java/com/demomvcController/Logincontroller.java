package com.demomvcController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Logincontroller 
{
	@RequestMapping("/login")
	public String login() 
	
	{
		System.out.println("This is our Login Cotroller");
		return "login";
	}

}
