package com.cisco.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/my-contact")
    public String getContactDetails() {
        return "Contact details";
    }

}
