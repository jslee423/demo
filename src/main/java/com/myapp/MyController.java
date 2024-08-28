package com.myapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MyController {
    @RequestMapping("api/health")
    public String sayHello() {
        return "API Health is good";
    }

    @RequestMapping("api/ping")
    public String sayPing() {
        return "Server responds good";
    }
}
