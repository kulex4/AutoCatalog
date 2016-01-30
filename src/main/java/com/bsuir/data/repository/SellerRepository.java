package com.bsuir.data.repository;

import com.bsuir.data.domain.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
