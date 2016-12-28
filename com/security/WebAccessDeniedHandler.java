package com.security;

import com.ems.IService.ILoginSerivice;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Apurbo on 12/7/2016.
 */
public class WebAccessDeniedHandler implements AccessDeniedHandler {
    private String accessDeniedUrl;
    private ILoginSerivice loginSerivice;

    public void setAccessDeniedUrl(String accessDeniedUrl) {
        this.accessDeniedUrl = accessDeniedUrl;
    }

    public void setLoginSerivice(ILoginSerivice loginSerivice) {
        this.loginSerivice = loginSerivice;
    }

    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {

    }
}
