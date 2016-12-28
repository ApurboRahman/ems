package com.security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;
import org.springframework.security.web.util.matcher.ELRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Apurbo on 12/7/2016.
 */
public class AuthenticationEntryPoint extends LoginUrlAuthenticationEntryPoint{

    private static final RequestMatcher REQUEST_MATCHER = new ELRequestMatcher("hasHeader('X-Requested-With','XMLHttpRequest')");
    public AuthenticationEntryPoint(String loginFormUrl) {
        super(loginFormUrl);
    }

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        if (REQUEST_MATCHER.matches(request)){
            response.sendError(HttpServletResponse.SC_FORBIDDEN,"SESSION_TIMED_OUT");
        }else {
            request.setAttribute("targetUrl",request.getRequestURI());
            super.commence(request,response,authException);
        }
    }


}
