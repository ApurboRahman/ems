package com.security;

import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.authentication.AuthenticationTrustResolverImpl;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Apurbo on 12/7/2016.
 */
public class AjaxTimeoutRedirectFilter extends GenericFilterBean {

    private AuthenticationTrustResolver authenticationTrustResolver = new AuthenticationTrustResolverImpl();

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        if (authenticationTrustResolver.isAnonymous(SecurityContextHolder.getContext().getAuthentication())) {
            String ajaxHeader = ((HttpServletRequest) servletRequest).getHeader("X-Requested-with");
            if ("XMLHttpRequest".equals(ajaxHeader)) {
                HttpServletResponse response = (HttpServletResponse) servletResponse;
                response.sendError(901);
                return;
            }
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
