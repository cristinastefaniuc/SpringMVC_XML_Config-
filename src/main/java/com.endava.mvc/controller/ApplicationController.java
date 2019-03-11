package com.endava.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RequestMapping("/")
public class ApplicationController {

    @GetMapping("/")
    public String showHomePage() {
        return "home";
    }

    @RequestMapping(value = "/show-answer", method = GET)
    public String showAnswer(@RequestParam("answer") String answer) {
        if(answer.equals("YES")) return "yes";
        else return "no";
    }

//    @RequestMapping(value = "/SpringMVC_XMLConfig_war_exploded", method = GET)
//    public String showForm(@RequestParam("answer") String answer) {
//        if(answer.equals("YES")) return "yes";
//        else return "no";
//    }
}