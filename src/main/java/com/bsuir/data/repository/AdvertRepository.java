package com.bsuir.data.repository;

import com.bsuir.data.domain.Advert;
import com.bsuir.data.domain.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdvertRepository extends JpaRepository<Advert, Long> {

    List<Advert> findBySeller(Seller seller);

}
