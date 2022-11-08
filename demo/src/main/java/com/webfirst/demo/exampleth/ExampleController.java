package com.webfirst.demo.exampleth;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExampleController {
	@GetMapping("first-th")
	public String getExampleTh(Model model, @RequestParam String name, @RequestParam String[] names) {
		model.addAttribute("names", names);
		model.addAttribute("name", name);
		return "example";
	}
}
