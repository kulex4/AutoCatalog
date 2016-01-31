package com.bsuir.data.repository.dto;

import com.bsuir.data.domain.dto.AutoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoDtoRepository extends JpaRepository<AutoDto, Long> {
}
