package com.lcr.security_demo;

import com.lcr.security_demo.entities.User;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JdkTest {
    public static void main(String[] args) {
        JdkTest jdkTest = new JdkTest();
        User user1 = new User();
        user1.setUsername("张三");
        User user2 = new User();
        jdkTest.m1(user1,user2);

    }
    public void m1(User user1, User user2){
        log.info(user1.getUsername()+","+user2.getUsername());
        m2(user1,user2);
        log.info(user1.getUsername()+","+user2.getUsername());
    }

    public void m2(User user1,User user2){
        user2.setUsername("李四");
    }
}
