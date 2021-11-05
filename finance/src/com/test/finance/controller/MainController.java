package com.test.finance.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.finance.model.service.FinanceService;
import com.test.finance.model.vo.Kospi;

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
		
		//int a = fService.getListCount();
		
		ArrayList<Kospi> KList = crawling();
		mv.setViewName("home");
		
		return mv;
	}
	
	 private ArrayList<Kospi> crawling() {
		
		ArrayList<Kospi> kospiList = new ArrayList();
		
		try {
			// 페이지 수 카운트 
			String url1 = "https://finance.naver.com/sise/investorDealTrendDay.naver?bizdate=20211105&sosok=&page=1";
			Document doc1 = Jsoup.connect(url1).get();
			
			String lastPage = doc1.select(".pgRR a").attr("href");
			int a = lastPage.indexOf("page") + 5;
			int length = lastPage.length();
			String page = lastPage.substring(a, length); 
			
			int pageCount = Integer.parseInt(page);	
			
			// 데이터 크롤링
			//for(int i = 1 ; i <= pageCount ; i++) {
			for(int i = 1 ; i <= 3 ; i++) {
				String url = "https://finance.naver.com/sise/investorDealTrendDay.naver?bizdate=20211105&sosok=&page=";
				url = url + i;
				Document doc = Jsoup.connect(url).get();
				Elements elems = doc.select(".type_1");
				elems = elems.select("tbody").select("tr");
				
				for(Element elem : elems){
					Elements elems2 = elem.select("td");
					int size = elems2.size();
					
					
					if(size == 11) {
						ArrayList<String> oneList = new ArrayList();
						for(Element elem2 : elems2) {
							oneList.add(elem2.text());
						}
						
						String date = "20"+oneList.get(0);
						date = date.replace(".", "");
						
						Kospi ko = new Kospi();
						
						
						ko.setDate(date);
						ko.setPersonal(oneList.get(1));
						ko.setForeigner(oneList.get(2));
						ko.setInstitutions(oneList.get(3));
						ko.setFiInvestment(oneList.get(4));
						ko.setInsurance(oneList.get(5));
						ko.setEquity(oneList.get(6));
						ko.setBank(oneList.get(7));
						ko.setEtcF(oneList.get(8));
						ko.setPensionFund(oneList.get(9));
						ko.setEtcC(oneList.get(10));
						
						kospiList.add(ko);
					}
					
				}

			}
			
			System.out.println(kospiList);
			
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		 
		return kospiList;
	}

	 
	 
}
