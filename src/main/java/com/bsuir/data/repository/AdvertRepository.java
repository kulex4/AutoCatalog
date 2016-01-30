package com.bsuir.data.repository;

import com.bsuir.data.domain.Advert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("advertRepository")
public interface AdvertRepository extends JpaRepository<Advert, Long> {
}
