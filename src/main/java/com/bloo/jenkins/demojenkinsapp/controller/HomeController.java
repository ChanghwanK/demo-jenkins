package com.bloo.jenkins.demojenkinsapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created by Bloo
 * @Date: 2021/06/05
 */


@RestController
public class HomeController {

    @GetMapping("")
    public String hello() {
        return "Hello Bloo";
    }
}
