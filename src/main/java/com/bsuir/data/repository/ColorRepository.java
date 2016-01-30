package com.bsuir.data.repository;

import com.bsuir.data.domain.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("colorRepository")
public interface ColorRepository extends JpaRepository<Color, Long> {
}
