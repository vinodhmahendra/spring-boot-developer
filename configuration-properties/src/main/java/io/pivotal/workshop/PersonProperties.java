package io.pivotal.workshop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "person")
public class PersonProperties {
	
	private String greetings;
	private String farewell;
	
	public String getGreetings() {
		return greetings;
	}
	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}
	public String getFarewell() {
		return farewell;
	}
	public void setFarewell(String farewell) {
		this.farewell = farewell;
	}
	
	

}
