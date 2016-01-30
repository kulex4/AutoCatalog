package com.bsuir.controller;

import com.bsuir.data.domain.Advert;
import com.bsuir.data.service.AdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller("advertController")
public class AdvertController {

    @Autowired
    AdvertService advertService;

    @RequestMapping(value = { "/adverts" }, method = RequestMethod.GET)
    public String autoPage(Map<String, Object> model) {
        Iterable<Advert> adverts = advertService.findAll();
        return "adverts";
    }
}
