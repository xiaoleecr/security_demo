package com.lcr.security_demo.service.impl;

import com.lcr.security_demo.entities.User;
import com.lcr.security_demo.service.MyUserDetailsService;
import com.lcr.security_demo.userdetails.UserDetailsImp;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsServiceImpl implements MyUserDetailsService, UserDetailsService {
    /**
     * 该接口应当根据传入的用户名或者账号从数据库中获取到用户记录
     * 返回的UserDetails对象会填充为Authentication对象的Principal属性
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserDetailsImp userDetailsImp = new UserDetailsImp();
        //user对象应该通过dao从数据库获取
        User user = new User();
        user.setUsername("张三");
        user.setPassword("123456");
        userDetailsImp.setUser(new User());

        return userDetailsImp;
    }
}
