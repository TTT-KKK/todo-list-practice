package com.example.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// http://localhost:8080/todoList
@RequestMapping("/")
@Controller
public class ToDoListController {
  @GetMapping("todoList")
  public String open(Model model) {
    String str = "Hello World";
    model.addAttribute("value", str);
    return "toDoList";
  }
}
