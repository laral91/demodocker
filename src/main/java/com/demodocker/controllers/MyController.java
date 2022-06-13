package com.demodocker.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping(value = "/test-docker/{name}")
	public String greet(@PathVariable("name") String name) {

		return "Hello " + name + "!";

	}

<<<<<<< HEAD
} //hdhdh
=======
} //prova
>>>>>>> branch 'main' of https://github.com/laral91/demodocker.git
