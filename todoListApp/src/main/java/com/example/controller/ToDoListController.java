package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("hello/*")
@Controller
public class ToDoListController {
	@GetMapping("world")
	public String open(Model model) {
		String str = "Hello World";
		model.addAttribute("value", str);
		return "toDoList";
	}
}
