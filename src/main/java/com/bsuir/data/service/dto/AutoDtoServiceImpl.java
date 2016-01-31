package com.bsuir.data.service.dto;

import com.bsuir.data.domain.dto.AutoDto;
import com.bsuir.data.repository.dto.AutoDtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service("autoDtoService")
public class AutoDtoServiceImpl implements AutoDtoService {

    @Autowired
    private AutoDtoRepository autoDtoRepository;

    public void saveOrUpdate(AutoDto autoDto) {
        autoDtoRepository.save(autoDto);
    }

}
