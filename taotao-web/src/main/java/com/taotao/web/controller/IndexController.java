package com.taotao.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	/*
	 * 通用頁面仿問
	 */
	@RequestMapping("index")
	public ModelAndView page() {
		return new ModelAndView("index");
	}
}
