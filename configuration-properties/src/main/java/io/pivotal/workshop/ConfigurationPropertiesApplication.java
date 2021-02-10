package io.pivotal.workshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigurationPropertiesApplication implements CommandLineRunner{

	final private PersonProperties personProperties;

	@Autowired
	public ConfigurationPropertiesApplication(PersonProperties personProperties) {
		this.personProperties = personProperties;
	}

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationPropertiesApplication.class, args);
	}

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String greetings() {
		return personProperties.getGreetings() + " Spring Boot 2 " + personProperties.getFarewell() + " Spring Boot 2";
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("initializing the test data");
		
		System.out.println("command line run is executed successfully");
	}

}
