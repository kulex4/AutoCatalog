package com.bsuir.data.repository;

import com.bsuir.data.domain.Advert;
import com.bsuir.data.domain.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvertRepository extends JpaRepository<Advert, Long> {

    List<Advert> findBySeller(Seller seller);

}
