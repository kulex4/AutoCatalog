package com.bsuir.controller;

import com.bsuir.data.domain.Advert;
import com.bsuir.data.domain.Seller;
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

    @RequestMapping(value = { "/adverts-all" }, method = RequestMethod.GET)
    public String allAdvertsPage(Map<String, Object> model) {
        Iterable<Advert> adverts = advertService.findAll();
        return "adverts-all";
    }

    @RequestMapping(value = { "/adverts-own" }, method = RequestMethod.GET)
    public String ownAdvertsPage(Map<String, Object> model) {
        Iterable<Advert> adverts = advertService.findBySeller(new Seller());
        return "adverts-own";
    }

    @RequestMapping(value = { "/advert-create" }, method = RequestMethod.GET)
    public String createAdvertPage(Map<String, Object> model) {
        //Iterable<Advert> adverts = advertService.findAll();
        return "advert-create";
    }
}
