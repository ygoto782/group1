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
	@RequestMapping("/search")
	public String search(Model m) {
//		全検索
		List<Search>search = searchRepository.findAll();
		 m.addAttribute("member",search);
		 return "search";
		
	}
	
	
}