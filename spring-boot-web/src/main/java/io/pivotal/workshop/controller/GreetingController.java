package io.pivotal.workshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController
@Controller
public class GreetingController {
	
	@RequestMapping(path = "/" , method = RequestMethod.GET)
	public @ResponseBody String greetings() {
		return "Hello: Spring Boot 2";
	}

}
