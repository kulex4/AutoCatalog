package com.bsuir.controller;

import com.bsuir.data.domain.*;
import com.bsuir.data.domain.dto.AdvertDto;
import com.bsuir.data.service.*;
import com.bsuir.data.service.dto.AdvertDtoService;
import com.bsuir.data.utils.DataGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.Map;

@Controller("advertController")
public class AdvertController {

    @Autowired
    AdvertService advertService;

    @Autowired
    AdvertDtoService advertDtoService;

    @Autowired
    StateService stateService;

    @Autowired
    BrandService brandService;

    @Autowired
    BodyTypeService bodyTypeService;

    @Autowired
    ColorService colorService;

    @Autowired
    EngineTypeService engineTypeService;

    @Autowired
    ModelService modelService;

    @Autowired
    TransmissionService transmissionService;

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
    public String createAdvertPage(Map<String, Object> model, @ModelAttribute("advertDto") AdvertDto advertDto) {
        Iterable<State> states = stateService.findAll();
        model.put("states", states);

        Iterable<Brand> brands = brandService.findAll();
        model.put("brands", brands);

        Iterable<Model> models = modelService.findAll();
        model.put("models", models);

        Iterable<Color> colors = colorService.findAll();
        model.put("colors", colors);

        Iterable<EngineType> engineTypes = engineTypeService.findAll();
        model.put("engineTypes", engineTypes);

        Iterable<BodyType> bodyTypes = bodyTypeService.findAll();
        model.put("bodyTypes", bodyTypes);

        Iterable<Transmission> transmissions = transmissionService.findAll();
        model.put("transmissions", transmissions);

        return "advert-create";
    }

    @RequestMapping(value = { "/advert-create-new" }, method = RequestMethod.POST)
    public String createNewAdvert(@ModelAttribute("advert") AdvertDto advertDto) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Seller seller = sellerService.findByLogin(auth.getName());
        advertDto.setSeller(seller);
        advertDto.setDateOfPublication(new Date());
        advertDtoService.saveOrUpdate(advertDto);
        return "redirect:/adverts-own";
    }

    @RequestMapping(value = { "/advert-delete-{id}" }, method = RequestMethod.GET)
    public String deleteAdvert(@PathVariable("id") String id) {
        Long idValue = Long.valueOf(id);
        advertService.removeById(idValue);
        return "redirect:/adverts-own";
    }
}
