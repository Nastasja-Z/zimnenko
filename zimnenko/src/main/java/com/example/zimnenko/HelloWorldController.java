package com.example.zimnenko;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {

    @GetMapping({"/", "/helloworld"})
    public String helloworld() {
        return "helloworld";
    }
}
