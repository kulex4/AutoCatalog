package com.bsuir.data.service;

import com.bsuir.data.domain.Transmission;
import com.bsuir.data.repository.TransmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service("transmissionService")
public class TransmissionServiceImpl implements TransmissionService {

    @Autowired
    private TransmissionRepository transmissionRepository;

    public Iterable<Transmission> findAll() {
        return transmissionRepository.findAll();
    }
}
