package com.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Apurbo on 12/7/2016.
 */
public class LogoutSuccessHandler extends SimpleUrlAuthenticationSuccessHandler{
    public LogoutSuccessHandler(String defaultTargetUrl) {
        super(defaultTargetUrl);
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        super.onAuthenticationSuccess(request,response,authentication);
    }
}
