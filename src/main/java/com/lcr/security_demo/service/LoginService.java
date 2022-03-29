package com.lcr.security_demo.service;

import com.lcr.security_demo.entities.User;
import com.lcr.security_demo.vo.ResultVo;

public interface LoginService {

    ResultVo login(User user) throws Exception;
}
