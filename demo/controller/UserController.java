package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;

//これはControllerだよ、の意味
@Controller
public class UserController {
	
	@GetMapping(value = "/user/search")
	public String displaySearch(Model model) {
		return "user/search";
	}
	
	@RequestMapping(value = "/user/id_search", method = RequestMethod.POST)
	public String search(@ModelAttribute UserSearchRequest userSearchRequest, Model model) {
		User user = userService.search(userSearchRequest);
		model.addAttribute("userinfo",user);
		return "user/search";
		
	}
}
