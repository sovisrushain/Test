package com.cisco.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    @GetMapping("/my-loans")
    public String getLoanDetails() {
        return "Loan details";
    }

}