package com.bsuir.data.service;

import com.bsuir.data.domain.Auto;
import com.bsuir.data.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service("autoService")
public class AutoServiceImpl implements AutoService {

    @Autowired
    private AutoRepository autoRepository;

    public Iterable<Auto> findAll() {
        return autoRepository.findAll();
    }
}
