package com.bsuir.data.repository;

import com.bsuir.data.domain.BodyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("bodyTypeRepository")
public interface BodyTypeRepository extends JpaRepository<BodyType, Long> {
}
