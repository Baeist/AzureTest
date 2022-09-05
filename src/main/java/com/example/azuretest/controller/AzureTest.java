package com.example.azuretest.controller;

import com.example.azuretest.utility.ConnectionManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Connection;


@Controller
public class AzureTest {

    @GetMapping("/hi")
    public String sayHello(){

        Connection connection = ConnectionManager.getConnection();

        return "index";
    }
    @GetMapping("/tester")
    public String sayComplete(){


        return "test";
    }
}
