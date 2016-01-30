package com.bsuir.data.repository;

import com.bsuir.data.domain.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("modelRepository")
public interface ModelRepository extends JpaRepository<Model, Long> {
}
