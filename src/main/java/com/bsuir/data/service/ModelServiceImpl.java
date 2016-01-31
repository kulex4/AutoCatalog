package com.bsuir.data.service;

import com.bsuir.data.domain.Model;
import com.bsuir.data.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service("modelService")
public class ModelServiceImpl implements ModelService {

    @Autowired
    private ModelRepository modelRepository;

    public Iterable<Model> findAll() {
        return modelRepository.findAll();
    }
}
