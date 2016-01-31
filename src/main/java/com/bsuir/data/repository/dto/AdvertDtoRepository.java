package com.bsuir.data.repository.dto;

import com.bsuir.data.domain.dto.AdvertDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertDtoRepository extends JpaRepository<AdvertDto, Long> {
}
