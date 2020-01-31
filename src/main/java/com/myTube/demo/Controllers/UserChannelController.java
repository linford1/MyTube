package com.myTube.demo.Controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myTube.Repositories.ChannelRepo;
import com.myTube.Repositories.UserRepo;
import com.myTube.Repositories.VideoRepo;

@Controller
@RequestMapping(value="/MyChannel")
public class UserChannelController 
{

		@Autowired
		public UserRepo userRepo;
		
		@Autowired
		public ChannelRepo channelRepo;
		
		@Autowired
		public VideoRepo videoRepo;
		
		@GetMapping
		public String MyChannelPage()
		{
			return "UserChannelPage";
		}
		
		@PostMapping
		public String registerUserAccount(Model model,HttpSession session)
		{
			model.addAttribute("user",session.getAttribute("user"));
			model.addAttribute("userChannel",session.getAttribute("userChannel"));
			return "UserChannelPage";
		}
}
		

