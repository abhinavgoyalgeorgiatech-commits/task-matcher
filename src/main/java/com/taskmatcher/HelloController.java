package com.taskmatcher;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(
		value = "/hello_world",
		produces = MediaType.APPLICATION_JSON_VALUE
	)
	public ResponseEntity<String> helloWorld() {
		return ResponseEntity.ok("{\"hello\": \"world\"}");
	}

}
