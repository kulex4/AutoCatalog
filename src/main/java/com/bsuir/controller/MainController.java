package com.bsuir.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class MainController {

    @RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
    public String mainPage(Map<String, Object> model) {
        /*model.put("time", new Date());
        String message = "Hello World";
        model.put("message", message);*/
        return "main";
    }

}