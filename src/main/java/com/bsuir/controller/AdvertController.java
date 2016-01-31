package com.bsuir.controller;

import com.bsuir.data.domain.*;
import com.bsuir.data.service.AdvertService;
import com.bsuir.data.service.SellerService;
import com.bsuir.data.utils.DataGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller("advertController")
public class AdvertController {

    @Autowired
    AdvertService advertService;

    @Autowired
    SellerService sellerService;

    @Autowired
    DataGenerator dataGenerator;

    @RequestMapping(value = { "/adverts-all" }, method = RequestMethod.GET)
    public String allAdvertsPage(Map<String, Object> model) {
        Iterable<Advert> adverts = advertService.findAll();
        model.put("adverts", adverts);
        return "adverts-all";
    }

    @RequestMapping(value = { "/adverts-own" }, method = RequestMethod.GET)
    public String ownAdvertsPage(Map<String, Object> model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Seller seller = sellerService.findByLogin(auth.getName());
        Iterable<Advert> adverts = advertService.findBySeller(seller);
        model.put("adverts", adverts);
        return "adverts-own";
    }

    @RequestMapping(value = { "/advert-create" }, method = RequestMethod.GET)
    public String createAdvertPage(Map<String, Object> model) {
        //Iterable<Advert> adverts = advertService.findAll();
        return "advert-create";
    }

    @RequestMapping(value = { "/advert-delete-{id}" }, method = RequestMethod.GET)
    public String deleteAdvert(@PathVariable("id") String id) {
        Long idValue = Long.valueOf(id);
        advertService.removeById(idValue);
        return "redirect:/adverts-own";
    }
}
