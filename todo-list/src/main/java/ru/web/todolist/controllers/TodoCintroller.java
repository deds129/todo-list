package ru.web.todolist.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * отображения страницы списка дел
 */
@Controller
public class TodoCintroller {

    @GetMapping("/")
    public String indexPage(){
        return "index";
    }

    @GetMapping("/todo")
    public String todoPage(){
        return "todo";
    }

}
