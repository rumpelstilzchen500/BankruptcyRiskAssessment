package com.api.BankruptcyRiskAssessment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("test")
    @ResponseBody
    public String test(){
        return "hello";
    }
}
