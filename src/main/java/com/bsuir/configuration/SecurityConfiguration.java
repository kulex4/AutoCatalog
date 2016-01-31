package com.bsuir.configuration;

import com.bsuir.data.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    SellerService sellerService;

    @Autowired
    public void registerGlobalAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(sellerService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/", "/home", "/adverts-all")
                .permitAll()
                .and().authorizeRequests()
                .antMatchers("/adverts-own", "/advert-create")
                .authenticated()
                .and().authorizeRequests()
                .antMatchers("/resources/**", "/**").permitAll();

        http
                .formLogin()
                .loginPage("/login")
                .usernameParameter("login")
                .passwordParameter("password");

        http
                .logout()
                .logoutSuccessUrl("/login?logout")
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"));

        http.csrf();
    }

}
