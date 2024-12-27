package com.example.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    // http://localhost:8080/ -> "index.html"
    @GetMapping
    public String index() {
        return "index";
    }
}