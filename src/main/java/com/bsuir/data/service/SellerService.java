package com.bsuir.data.service;

import com.bsuir.data.domain.Seller;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface SellerService extends UserDetailsService {

    Iterable<Seller> findAll();

    UserDetails loadUserByUsername(String email);

    Seller findByLogin(String login);

}
