package com.test.spring.car.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.spring.car.model.Car;
import com.test.spring.car.model.Shop;


@Controller
public class WelcomeConrtoller {

	 
	@RequestMapping(value={"/welcome"},  method=RequestMethod.GET)
	public ModelAndView showMessage(Model model) {
		final ModelAndView mv = new ModelAndView("hello");
		final String message = "Hello page";
		final String title = "Spring pet project";
		mv.addObject("message", message);
		mv.addObject("title",title);
		model.addAttribute("shop", new Shop());
		return mv;
	}
	
	
	@RequestMapping(value={"/welcome"},  method=RequestMethod.POST)
	public ModelAndView login() {
		final ModelAndView mv = new ModelAndView("redirect:shop");
		return mv;
	}

	
}
