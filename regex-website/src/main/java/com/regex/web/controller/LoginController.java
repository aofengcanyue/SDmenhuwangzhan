package com.regex.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.regex.web.common.dto.sys.SysUser;

@Controller
public class LoginController extends BaseController {
	
	@RequestMapping("login")
	public String login(HttpServletRequest request) {
	    SysUser sysUser = getCurrentUser(request);
	    if(sysUser == null) {
	        return "login";
	    } else {
	        return "redirect:index.htm";
	    }
	}

}
