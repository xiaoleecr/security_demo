package com.lcr.security_demo.mapper;

import com.lcr.security_demo.entities.User;

//@Mapper
public interface UserMapper {
    public User getUserById(String id);
    public User getUserByUsername(String name);
}
