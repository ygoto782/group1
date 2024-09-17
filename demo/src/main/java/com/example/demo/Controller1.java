package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class Controller1 {
	//@Autowired
	//private TaskdbRepository taskdbRepository;
	
	
	String message = null;
	String message2 = null;
	String message3 = null;
	String message4 = null;
	
	
	
	@GetMapping("/menu")
   public String menu(){
		return "menu";
	}
	
	
	
	@RequestMapping("/send01")
    public String send01(){
        return "send01";
    }

	
    @PostMapping("/receive01")
    public String receive01(
        Model m,
        @RequestParam("syain")String syain,
        @RequestParam("age")String age,
        @RequestParam("pass")String pass,
        @RequestParam("pass2")String pass2
    ){
        		m.addAttribute("syain", syain);
                m.addAttribute("age", age);
                m.addAttribute("pass", pass);
                m.addAttribute("pass2", pass2);
                return "receive01";
    }
	
    
    @PostMapping("/send01")
    public String send01(
        Model m,
        @RequestParam("syain")String syain,
        @RequestParam("age")String age,
        @RequestParam("pass")String pass,
        @RequestParam("pass2")String pass2
    ){
            	m.addAttribute("syain", syain);
                m.addAttribute("age", age);
                m.addAttribute("pass", pass);
                m.addAttribute("pass2", pass2);
                return "send01";
    }

    
    
	@PostMapping("/finish")
	public String finish(
	) {
		
		
		
		//taskdbRepository.saveAndFlush(taskdb);
		
	return "finish";
    }
	
	
	
	
	
	
	public static void main(String[] args) {
	String str = "Aa123456";
	String str2 = "Aa123456";
	String str3= null;
	if((str.length() > 0) && (!str.matches("[0-9a-zA-Z]{8,}")) ) {
		System.out.println(str);
		 str3 = "あああ";
		 System.out.println(str3);
	}else {
		System.out.println("aaa");
	}
	if(!str.matches(str2)) {
		System.out.println(str2);
	}else {
		System.out.println("aaa");
	}
	
	}
	
	
	
    
}