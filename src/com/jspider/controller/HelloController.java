package com.jspider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/google")
	public ModelAndView remote() {
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("msg", "Body acheives what mind thought");
		return modelandview;
	}
	@RequestMapping("/yahoo")
	public ModelAndView marker() {
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("msg", "Believe in Yourself");
		return modelandview;
	}

}