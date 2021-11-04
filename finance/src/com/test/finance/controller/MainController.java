package com.test.finance.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.finance.model.service.FinanceService;

@Controller	
public class MainController {
	@Autowired
	private FinanceService fService;
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping("home.do")
	public ModelAndView home(ModelAndView mv, @RequestParam(value="page", required=false) Integer page) {
		mv.setViewName("home");
		
		return mv;
	}
	
	@RequestMapping("crawling.do")
	public ModelAndView crawlingList(ModelAndView mv, @RequestParam(value="page", required=false) Integer page) {
		
		int a = fService.getListCount();
		
		System.out.println("조회결과 : " + a);
		
		mv.setViewName("home");
		
		return mv;
	}
}
