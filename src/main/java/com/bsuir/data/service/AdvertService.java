package com.bsuir.data.service;


import com.bsuir.data.domain.Advert;
import com.bsuir.data.domain.Seller;

public interface AdvertService {

    Iterable<Advert> findAll();

    Iterable<Advert> findBySeller(Seller seller);

}
