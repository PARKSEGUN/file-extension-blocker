package com.test.file_extension_blocker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExtensionController {


    @GetMapping("")
    public String home() {
        return "home";
    }
}
