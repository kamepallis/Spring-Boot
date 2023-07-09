package com.sudhir.firstapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class TestController {

    @GetMapping(name = "/")
    public String test() {
        return "Hello world";
    }
}
