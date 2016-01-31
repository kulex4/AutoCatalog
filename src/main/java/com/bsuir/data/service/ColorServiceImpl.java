package com.bsuir.data.service;

import com.bsuir.data.domain.Color;
import com.bsuir.data.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service("colorService")
public class ColorServiceImpl implements ColorService {

    @Autowired
    private ColorRepository colorRepository;

    public Iterable<Color> findAll() {
        return colorRepository.findAll();
    }
}
