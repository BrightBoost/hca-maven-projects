package com.webfirst.demo.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webfirst.demo.models.Greeting;

@RestController
public class GreetingController {

	ArrayList<Greeting> greetings = new ArrayList<>();
	// using a query parameter (such as example.com?name=blabla
	@GetMapping("hi")
	public String getHello(@RequestParam String name) {
		return "Hi " + name + "!";
	}

	// using a path parameter (such as example.com/hi/blabla
	@GetMapping("hi/{name}")
	public String getHelloPathParam(@PathVariable String name) {
		return "Hi " + name + "!";
	}
	
	// careful with ambiguous endpoints
//	@GetMapping("hi/{problem}")
//	public String getHelloProblem(@PathVariable String name) {
//		return "Hi " + name + "!";
//	}
	
	@GetMapping("hi2")
	public String getHelloReqBody(@RequestBody String name) {
		return "Hi " + name + "!";
	}
	
	@PostMapping("greeting")
	public void addGreeting(@RequestBody Greeting greeting) {
		greetings.add(greeting);	
	}

	// json response
	@GetMapping("greeting")
	public Greeting getGreeting() {
		return new Greeting(1, "Hi all!");
	}

}
