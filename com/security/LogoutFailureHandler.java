package com.security;

import com.ems.IService.ILoginSerivice;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Created by Apurbo on 12/7/2016.
 */
public class LogoutFailureHandler implements ApplicationListener<ContextRefreshedEvent>{
    private ILoginSerivice loginSerivice;

    public void setLoginSerivice(ILoginSerivice loginSerivice) {
        this.loginSerivice = loginSerivice;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

    }
}
