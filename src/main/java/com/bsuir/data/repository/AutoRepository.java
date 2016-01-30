package com.bsuir.data.repository;

import com.bsuir.data.domain.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("autoRepository")
public interface AutoRepository extends JpaRepository<Auto, Long> {
}
