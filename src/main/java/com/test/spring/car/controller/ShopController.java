package com.test.spring.car.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.common.collect.Lists;
import com.test.spring.car.model.Shop;

@Controller
public class ShopController {

	
	@RequestMapping(value="/shop", method=RequestMethod.GET)
	public ModelAndView getCarList(Model model){
		model.addAttribute("shop", new Shop());
		ModelAndView mv = new ModelAndView("shop");
		List<String> cars = Lists.newArrayList();
		cars.add("Alfa");
		cars.add("BMW");
		cars.add("Toyota");
		cars.add("Seat");
		mv.addObject("cars",cars);
		return mv;
	}
	
	
	@RequestMapping(value={"/shop"},  method=RequestMethod.POST)
	public ModelAndView redirectToShop(@ModelAttribute("shop") final Shop shop, BindingResult bindingResult) {
		final ModelAndView mv = new ModelAndView("shop");
		System.out.println("inside shop post method");
		mv.addObject("shop", shop);
		return mv;
	}
	
}
