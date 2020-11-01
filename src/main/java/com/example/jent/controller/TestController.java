package com.example.jent.controller;

import com.example.jent.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
    @Autowired
    TestService testService;
   @GetMapping("/add")
    public int test(int a, int b) {
        return testService.test(a, b);
    }
}
