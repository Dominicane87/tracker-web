package edu.xored.tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AngularJSForwardController {

    @RequestMapping(value = {"/issues/{hash}"})
    public String redirect() {
        return "forward:/";
    }
}
