package com.bsuir.data.service;

import com.bsuir.data.domain.Brand;
import com.bsuir.data.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service("brandService")
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    public Iterable<Brand> findAll() {
        return brandRepository.findAll();
    }
}
