package com.bsuir.data.repository;

import com.bsuir.data.domain.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
