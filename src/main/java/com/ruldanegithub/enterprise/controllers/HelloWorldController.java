package com.ruldanegithub.enterprise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm () {
        return "helloworld-form";
    }

    @RequestMapping(value = "/processForm")
    public String processForm (@RequestParam(value = "studentName") String studentName) {
        return "helloworld";
    }
}
