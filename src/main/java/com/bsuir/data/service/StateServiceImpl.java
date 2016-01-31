package com.bsuir.data.service;

import com.bsuir.data.domain.State;
import com.bsuir.data.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service("stateService")
public class StateServiceImpl implements StateService {

    @Autowired
    private StateRepository stateRepository;

    public Iterable<State> findAll() {
        return stateRepository.findAll();
    }

}
