package com.example.azuretest.controller;

import com.example.azuretest.utility.ConnectionManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Connection;


@Controller
public class AzureTest {

    @GetMapping("/")
    public String sayHello(){


        return "test";
    }
    @GetMapping("/tester")
    public String sayComplete(){


        return "index";
    }
}
