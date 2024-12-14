package com.drucare;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LabController {
	
	@GetMapping()
	public String welcome() {
		return "Welcome ti Lab version One";
	}

}
