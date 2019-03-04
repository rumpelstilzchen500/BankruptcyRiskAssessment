package com.api.BankruptcyRiskAssessment.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest")
@RestController
public class TestController {

    @GetMapping("/all")
    public String hello() {
        return "Hello For All";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/secured/all")
    public String securedHello() {
        return "Secured For User";
    }


    @GetMapping("/secured/alternate")
    public String alternate() {
        return "alternate for all users";
    }
}
