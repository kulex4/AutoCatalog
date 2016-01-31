package com.bsuir.data.service;

import com.bsuir.data.domain.EngineType;
import com.bsuir.data.repository.EngineTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service("engineTypeService")
public class EngineTypeServiceImpl implements EngineTypeService {

    @Autowired
    private EngineTypeRepository engineTypeRepository;

    public Iterable<EngineType> findAll() {
        return engineTypeRepository.findAll();
    }
}
