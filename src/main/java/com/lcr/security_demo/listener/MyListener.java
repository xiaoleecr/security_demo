package com.lcr.security_demo.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//@Component
@Slf4j
public class MyListener implements ApplicationListener {
    public MyListener() {
        System.out.println("我的监听器");
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        log.info("这是监听器事件:"+event.getClass().getName());
    }
}
