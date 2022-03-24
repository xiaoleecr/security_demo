package com.lcr.security_demo.service.impl;

import com.lcr.security_demo.entities.User;
import com.lcr.security_demo.service.MyUserDetailsService;
import com.lcr.security_demo.userdetails.UserDetailsImp;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailsServiceImpl implements MyUserDetailsService, UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserDetailsImp userDetailsImp = new UserDetailsImp();
        byte[] bytes = new byte[]{'a','b','3'};
        User user = new User();
        user.setUsername("张三");
        user.setPassword("123456");
        userDetailsImp.setUser(new User());
        return userDetailsImp;
    }
}
