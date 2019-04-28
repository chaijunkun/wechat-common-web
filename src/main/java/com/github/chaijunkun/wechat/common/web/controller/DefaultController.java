package com.github.chaijunkun.wechat.common.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author chaijunkun
 * @since 2016年12月6日
 */
@Controller
public class DefaultController {
	
	@RequestMapping(value="/index")
	public ModelAndView index(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView("default/index");
		modelAndView.addObject("timestamp", System.currentTimeMillis());
		return modelAndView;
	}

}
