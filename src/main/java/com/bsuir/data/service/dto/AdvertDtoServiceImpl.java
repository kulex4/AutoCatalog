package com.bsuir.data.service.dto;

import com.bsuir.data.domain.dto.AdvertDto;
import com.bsuir.data.repository.dto.AdvertDtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service("advertDtoService")
public class AdvertDtoServiceImpl implements AdvertDtoService {

    @Autowired
    private AdvertDtoRepository advertDtoRepository;

    public void saveOrUpdate(AdvertDto advertDto) {
        advertDtoRepository.save(advertDto);
    }

}
