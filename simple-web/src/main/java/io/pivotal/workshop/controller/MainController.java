package io.pivotal.workshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {

//	@RequestMapping(path = "/" , method = RequestMethod.GET)
	@GetMapping(path = "/")
	public ModelAndView home() {
		return new ModelAndView("views/home");
	}
}
