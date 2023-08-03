package com.example.springboot;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "http://tap-gui.tap.bkieling-tap-testbed.tapdemo.vmware.com" })
@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot + Tanzu lovers!";
	}

}