package com.lcr.security_demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/hello")
    //开启授权
    @PreAuthorize("hasAuthority('authority01')")
    public String hello() {
        return "hello";
    }

}
