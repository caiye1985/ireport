package com.agileEAP.ireport.controller;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * LoginController璐熻矗鎵撳紑鐧诲綍椤甸潰(GET璇锋眰)鍜岀櫥褰曞嚭閿欓〉闈�POST璇锋眰)锛�

 * 鐪熸鐧诲綍鐨凱OST璇锋眰鐢盕ilter瀹屾垚,
 * 
 * @author calvin
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET)
	public String login() {
		return "account/login";
	}

//	@RequestMapping(method = RequestMethod.POST)
//	public String login(@RequestParam(FormAuthenticationFilter.DEFAULT_USERNAME_PARAM) String userName, Model model) {
//		model.addAttribute(FormAuthenticationFilter.DEFAULT_USERNAME_PARAM, userName);
//	
//		return "report/index";
//	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String fail(@RequestParam(FormAuthenticationFilter.DEFAULT_USERNAME_PARAM) String userName, Model model) {
		model.addAttribute(FormAuthenticationFilter.DEFAULT_USERNAME_PARAM, userName);
		return "account/login";
	}

}
