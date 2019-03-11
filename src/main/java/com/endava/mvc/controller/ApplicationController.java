package com.endava.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RequestMapping("/")
@Controller
@EnableWebMvc
public class ApplicationController {

    @RequestMapping(value = "/", method = GET)
    public String showHomePage() {
        return "home";
    }

    @RequestMapping(value = "/show-answer", method = GET)
    public String showAnswer(@RequestParam("answer") String answer) {
        if(answer.equals("YES")) return "yes";
        else return "no";
    }
}