package com.bsuir.data.service;

import com.bsuir.data.domain.Seller;
import com.bsuir.data.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service("sellerService")
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public Iterable<Seller> findAll() {
        return sellerRepository.findAll();
    }
}
