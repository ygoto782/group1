package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class Controller1 {
	
	String message = null;
	String message2 = null;
	String message3 = null;
	
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
		@RequestParam("pass") String pass,
		@RequestParam("pass2") String pass2
	) {
		if(syain.length() > 0) {
		m.addAttribute("syain",syain);
		}else {
			message = "必須入力です";
			return "send";
		}
		
		if(age.length() > 0) {
		m.addAttribute("age",age);
		}else {
			message = "必須入力です";
			return "send";
		}
		
		if((pass.length() > 0) && (pass.matches("[a-zA-Z0-9]{8,}"))) {
		m.addAttribute("pass",pass);
		}else {
			message = "必須入力です";
			message2 = "大小半角英数を含む8文字以上で入力してください";
			return "send";
		}
		
		if(pass2.length() > 0 && (pass2.matches("[a-zA-Z0-9]{8,}")) && (pass == pass2)) {
		m.addAttribute("pass2",pass2);
		}else {
			message = "必須入力です";
			message2 = "大小半角英数を含む8文字以上で入力してください";
			message3 = "パスワードと同じものを入力してください";
			return "send";
		}
			
	    return "receive";
    }
	
	
	@PostMapping("/finish")
	public String finish() {
	return "finish";
    }
	
	
	
	
	
	
	public static void main(String[] args) {
	String str = "Aa123456";
	String str2 = "Aa123456";
	String str3= null;
	if((str.length() > 0) && (str.matches("[a-zA-Z0-9]{8,}")) ) {
		System.out.println(str);
		 str3 = "あああ";
		 System.out.println(str3);
	}else {
		System.out.println("aaa");
	}
	if((str2.length() > 0) && (str2.matches("[a-zA-Z0-9]{8,}")) && (str==str2) ) {
		System.out.println(str2);
	}else {
		System.out.println("aaa");
	}
	
	}
}