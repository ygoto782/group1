package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController{
	@Autowired
	private SearchRepository searchRepository;
	@RequestMapping("/Search")
	public String search01(Model m) {
//		全検索
		List<Search>search = searchRepository.findAll();
		 m.addAttribute("search",search);
		 return "search01";		
		 
////		条件検索（開始日）
//		Optional<Search> record = SearchRepository.findById(start);				
//				record between(task date){
//					  return !(startDate.isAfter(date) || endDate.isBefore(date));
//					}
////		条件検索（終了日）
//		Optional<Search> record = SearchRepository.findById(finish);				
//				record between(LocalDate date){
//					  return !(startDate.isAfter(date) || endDate.isBefore(date));
//					}
		 		 
		 
	}	
}