package com.lcr.security_demo.controller;

import com.lcr.security_demo.entities.User;
import com.lcr.security_demo.service.LoginService;
import com.lcr.security_demo.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/user/login")
    public ResultVo login(@RequestBody User user){
        ResultVo resultVo = new ResultVo();
        UserDetails userDetails = loginService.login(user);
        return resultVo;
    }
}
