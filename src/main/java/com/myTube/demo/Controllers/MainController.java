package com.myTube.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.myTube.Repositories.UserRepo;


@Controller
public class MainController {

	@Autowired
	public UserRepo userRepo;
	
	   @GetMapping("/")
	    public String root() {
	        return "index";
	    }
	   
	   @GetMapping("/MainPage")
	    public String MainPage(Model model) {
	        return "MainPage";
	    }
	   

	    @GetMapping("/login")
	    public String login(Model model) {
	        return "login";
	    }

	    @GetMapping("/user")
	    public String userIndex() {
	        return "user/index";
	    }
	
	/*@GetMapping("/home")
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String registration(Model model, WebRequest request) 
	{
		m.addAttribute("name", "linford young");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now(); 
		User nUser = new User("Xillin","123","Linford@gmail.com","Linford","Young", now.toString());
		userRepo.saveAndFlush(nUser);
		
		User newUser = new User();
		
		model.addAttribute("user", newUser);
		 
		return "LandingPage";
	}*/
	
}
