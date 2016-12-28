package com.security;

import com.ems.IService.ILoginSerivice;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Apurbo on 12/7/2016.
 */
public class LoginFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    private ILoginSerivice loginSerivice;

    public void setLoginSerivice(ILoginSerivice loginSerivice) {
        this.loginSerivice = loginSerivice;
    }

    public LoginFailureHandler(String defaultFailureUrl) {
       this.setDefaultFailureUrl(defaultFailureUrl);

    }
}
