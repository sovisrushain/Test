package com.cisco.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    @GetMapping("/my-notices")
    public String getNoticeDetails() {
        return "Notice details";
    }

}