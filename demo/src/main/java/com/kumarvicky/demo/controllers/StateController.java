package com.kumarvicky.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StateController {

    @GetMapping("state")
    public String getState()
    {
        return "State";
    }
}
