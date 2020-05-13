
package com.inventsale.inventorysales.controllers.general;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPage {

	@GetMapping("/")
	public String  greeting() {
		return "Hello from Sarai Sarai at "+ LocalDateTime.now();
	}
}
