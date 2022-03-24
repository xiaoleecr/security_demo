package com.lcr.security_demo.service;

import com.lcr.security_demo.entities.User;
import org.springframework.security.core.userdetails.UserDetails;

public interface LoginService {

    UserDetails login(User user);
}
