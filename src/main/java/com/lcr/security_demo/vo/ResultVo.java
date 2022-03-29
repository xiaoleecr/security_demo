package com.lcr.security_demo.vo;

import com.lcr.security_demo.entities.User;
import lombok.Data;

import java.util.Map;

@Data
public class ResultVo {
    private User user;
    private String code;
    private Map<String,String> map;
}
