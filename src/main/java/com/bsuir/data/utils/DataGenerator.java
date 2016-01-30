package com.bsuir.data.utils;

import com.bsuir.data.domain.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component("dataGenerator")
public class DataGenerator {

    private Advert advert;

    public DataGenerator() {
        this.advert = generateOneAdvert();
    }

    public Advert getAdvert() {
        return advert;
    }

    private Advert generateOneAdvert() {
        BodyType bodyType = new BodyType();
        bodyType.setName("Sedan");

        EngineType engineType = new EngineType();
        engineType.setName("Diesel");

        Transmission transmission = new Transmission();
        transmission.setName("Automatic");

        Brand brand = new Brand();
        brand.setName("Audi");

        Model model = new Model();
        model.setName("A6");

        Color color = new Color();
        color.setName("Black");

        State state = new State();
        state.setName("Used");

        Auto auto = new Auto();
        auto.setBodyType(bodyType);
        auto.setEngineType(engineType);
        auto.setTransmission(transmission);
        auto.setBrand(brand);
        auto.setModel(model);
        auto.setColor(color);
        auto.setState(state);
        auto.setYear(2014);
        auto.setPrice(35000);

        Seller seller = new Seller();
        seller.setName("Nikolai Pashkevich");
        seller.setEmail("kulex4@gmail.com");
        seller.setPassword("1111");
        seller.setPhone("+375295620894");

        Advert advert = new Advert();
        advert.setDateOfPublication(new Date());
        advert.setAuto(auto);
        advert.setSeller(seller);

        return advert;
    }
}
