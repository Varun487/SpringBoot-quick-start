package com.varun.springbootquickstart.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Defaults to GET request when not explicitly mentioned
    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello";
    }
}
