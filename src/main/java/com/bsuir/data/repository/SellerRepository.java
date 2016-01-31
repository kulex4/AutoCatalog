package com.bsuir.data.repository;

import com.bsuir.data.domain.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {

    @Query("FROM Seller WHERE login = ?1")
    Seller findByLogin(String login);

}
