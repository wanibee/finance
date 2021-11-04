package com.test.finance.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller	
public class MainController {
	
	@RequestMapping("home.do")
	public ModelAndView boardList(ModelAndView mv, @RequestParam(value="page", required=false) Integer page) {
		mv.setViewName("home");
		
		return mv;
	}
}
