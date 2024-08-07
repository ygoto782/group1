package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class Controller1 {
	
	
	@GetMapping("/menu")
   public String menu(){
		return "menu";
	}
	
	
	@GetMapping("/send")
		public String send() {
		return "send";
	}
	
	
	@PostMapping("/receive")
	public String receive(
		Model m,
		@RequestParam("syain") String syain,
		@RequestParam("age") String age,
		@RequestParam("pass") String pass
	) {
		m.addAttribute("syain",syain);
		m.addAttribute("age",age);
		m.addAttribute("pass",pass);
	    return "receive";
}

}
