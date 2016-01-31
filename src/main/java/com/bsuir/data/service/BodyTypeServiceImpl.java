package com.bsuir.data.service;

import com.bsuir.data.domain.BodyType;
import com.bsuir.data.repository.BodyTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service("bodyTypeService")
public class BodyTypeServiceImpl implements BodyTypeService {

    @Autowired
    private BodyTypeRepository bodyTypeRepository;

    public Iterable<BodyType> findAll() {
        return bodyTypeRepository.findAll();
    }
}
