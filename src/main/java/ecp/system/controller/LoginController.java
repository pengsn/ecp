package ecp.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ecp.base.BaseController;

@Controller
@RequestMapping("login")
public class LoginController extends BaseController{
	
	@RequestMapping("login")
	public String login()
	{
		return "login";
	}
	
}
