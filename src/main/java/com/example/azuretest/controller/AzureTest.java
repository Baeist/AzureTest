package com.example.azuretest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AzureTest {

    @GetMapping("/")
    public String sayHello(){

        return "index";
    }
}
