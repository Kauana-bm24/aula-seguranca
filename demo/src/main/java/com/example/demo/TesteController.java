package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestController;

@RestController
@RequestMapping("/")
public class TesteController {

    @GetMapping
    public String ola() {
        
                return "Hello, World!";
    }

}