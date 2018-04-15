package com.sash.dev.simplerestservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
public class BasicController {

    @GetMapping
    public String greetingMessage() {
        return "Hello there !! " +
                "welcome to reactive web";
    }
}
