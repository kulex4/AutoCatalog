package com.bsuir.data.service;

import com.bsuir.data.domain.Seller;
import com.bsuir.data.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Transactional
@Service("sellerService")
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public Iterable<Seller> findAll() {
        return sellerRepository.findAll();
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Seller seller = sellerRepository.findByLogin(username);
        Set<GrantedAuthority> roles = new HashSet<GrantedAuthority>();
        roles.add(new SimpleGrantedAuthority("Seller"));

        return new org.springframework.security.core.userdetails.User(seller.getLogin(),
                seller.getPassword(),
                roles);
    }

    public Seller findByLogin(String login) {
        return sellerRepository.findByLogin(login);
    }
}
