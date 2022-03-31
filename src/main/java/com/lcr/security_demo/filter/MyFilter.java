package com.lcr.security_demo.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Slf4j
@Component
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("myfilter初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("执行myfilter");
        log.info("先处理请求");
        //该方法执行完后，response对象会有变化
        filterChain.doFilter(servletRequest,servletResponse);
        log.info("再处理响应");
    }

    @Override
    public void destroy() {
        log.info("myfilter销毁");
    }
}
