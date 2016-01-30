package com.bsuir.controller;

import com.bsuir.data.domain.Auto;
import com.bsuir.data.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller("autoController")
public class AutoController {

    @Autowired
    AutoService autoService;

    @RequestMapping(value = { "/auto" }, method = RequestMethod.GET)
    public String autoPage(Map<String, Object> model) {
        Iterable<Auto> autos = autoService.findAll();
        return "auto";
    }
}
