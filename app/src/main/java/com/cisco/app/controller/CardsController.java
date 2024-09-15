package com.cisco.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @GetMapping("/my-card")
    public String getCardDetails() {
        return "Card details";
    }

}