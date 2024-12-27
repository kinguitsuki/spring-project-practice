package com.example.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Taskcontroller {
    @GetMapping("/tasks")
    public String list(){
        return "tasks/list";
    }
}