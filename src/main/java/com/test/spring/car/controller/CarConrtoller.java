package com.test.spring.car.controller;

import java.text.Normalizer.Form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.spring.car.model.Car;

@Controller
public class CarConrtoller {

	String message = "Welcome to Spring MVC!";
	 
	@RequestMapping(path="/hello",  method=RequestMethod.GET)
	public ModelAndView showMessage(
			@ModelAttribute Car car) {
		System.out.println("in controller");
 
		final ModelAndView mv = new ModelAndView("car");
		mv.addObject("message", message);
		//mv.addObject("name", name);
		return mv;
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView setCar(@ModelAttribute("car") Car car, BindingResult result, Model model){
		final ModelAndView modelAndView = new ModelAndView("index");
		//modelAndView.addObject("name",);
		return modelAndView;
	}
	
	
}
