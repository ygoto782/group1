package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class Controller1 {
	
	int num = 1;
	
	
	@Autowired
	private TaskdbRepository taskdbRepository;
	
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
			Model m,
			@RequestParam("syain")String syain,
	        @RequestParam("age")String age,
	        @RequestParam("pass")String pass
			){
		
		Taskdb taskdb = new Taskdb();
		taskdb.setId(num);
		taskdb.setSyain(syain);
		taskdb.setAge(age);
		taskdb.setPass(pass);
		
		taskdbRepository.saveAndFlush(taskdb);
		
		num++;
		
	return "finish";
    }
    
	
	
	@RequestMapping("/delete")
	public String delete()//(Model m
			//,@RequestParam("id")int id) 
			{
		//m.addAttribute("id", id);
		
		return "delete";
	}
	
	
	
	@PostMapping("/delete2")
	public String delete2(Model m,
//			@RequestParam("id")int id,
			@RequestParam("syain")String syain,
	        @RequestParam("age")String age,
	        @RequestParam("pass")String pass
			){

		
		Taskdb taskdb = new Taskdb();
//		taskdb.setId(id);
		taskdb.setSyain(syain);
		taskdb.setAge(age);
		taskdb.setPass(pass);
		
		taskdbRepository.delete(taskdb);
		

		return "delete2";
	}
	
	
//		List<Taskdb> taskdb = taskdbRepository.findById(1);
		
//		taskdbRepository.delete(taskdb);
	
	
	
	
}