package com.bsuir.data.service;

import com.bsuir.data.domain.Advert;
import com.bsuir.data.domain.Seller;
import com.bsuir.data.repository.AdvertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service("advertService")
public class AdvertServiceImpl implements AdvertService {

    @Autowired
    private AdvertRepository advertRepository;

    public Iterable<Advert> findAll() {
        return advertRepository.findAll();
    }

    public Iterable<Advert> findBySeller(Seller seller) {
        return advertRepository.findBySeller(seller);
    }

    public void saveOrUpdate(Advert advert) {
        advertRepository.save(advert);
    }

    public void removeById(Long id) {
        advertRepository.delete(id);
    }
}
