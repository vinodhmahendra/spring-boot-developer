package io.pivotal.workshop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PropertyFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertyFileApplication.class, args);
	}
	
	@Value("${message}")
	private String message;

	@RequestMapping(path = "/" , method = RequestMethod.GET)
	public String greetings() {
		return message;
	}
}
