package com.webfirst.demo.exampleform;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DogController {
	static ArrayList<Dog> dogs = new ArrayList<>();
	@GetMapping("dog")
	public String dogForm(Model model) {
		model.addAttribute(new Dog());
		return "newdog";
	}
	
	@PostMapping("addDog")
	public String addDog(Model model, @ModelAttribute Dog dog) {
		dogs.add(dog);
		model.addAttribute("dogs", dogs);
		return "doglist";
	}

}
