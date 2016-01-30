package com.bsuir.data.repository;

import com.bsuir.data.domain.EngineType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("engineTypeRepository")
public interface EngineTypeRepository extends JpaRepository<EngineType, Long> {
}
