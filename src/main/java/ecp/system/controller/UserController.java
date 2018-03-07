package ecp.system.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ecp.base.BaseController;
import ecp.base.Result;

@Controller
@RequestMapping("user")
public class UserController extends BaseController{
	
	@RequestMapping("toUserList")
	public String toUserList()
	{
		return "user/user";
	}
	
	@RequestMapping("check")
	@ResponseBody
	public Result check()
	{
		Result res = new Result();
		res.setCode(1);
		res.setMsg("中文字符串");
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("test", "test");
		res.setData(map);
		return res;
	}
	
}
