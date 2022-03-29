package com.lcr.security_demo.service.impl;

import com.lcr.security_demo.entities.User;
import com.lcr.security_demo.service.LoginService;
import com.lcr.security_demo.userdetails.UserDetailsImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    AuthenticationManager authenticationManager;

    @Override
    public UserDetails login(User user) throws Exception {
//        使用UsernamePasswordAuthenticationToken类作为认证方法的入参，这是Authentication的一个实现类
        UsernamePasswordAuthenticationToken  authenticationToken = new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword());
        // authenticate方法最终会调用到我们自定义的认证接口，即MyUserDetailsService
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);
        // 如果认证成功，则会返回一个authenticate对象，否则返回null
        if (null == authenticate){
            throw new Exception("用户名或密码错误");
        }
        //用jwt工具类将userid生成jwt，这样下次下次登录时传过来的token，解析后就可以获取到userid，然后根据userid从redis缓存获取到用户信息

        //以userid为key，将完整的用户信息存入redis缓存

        //返回UserDetails对象
        UserDetailsImp userDetailsImp = new UserDetailsImp();
        User retUser = (User) authenticate.getPrincipal();
        userDetailsImp.setUser(retUser);
        return userDetailsImp;
    }
}
