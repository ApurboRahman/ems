package com.security;

import org.springframework.security.authentication.AuthenticationDetailsSource;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.WebAuthenticationDetails;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Apurbo on 12/7/2016.
 */
public class WebAuthenticationDetialsSource implements AuthenticationDetailsSource<HttpServletRequest, WebAuthenticationDetails> {

    private String branchCode;

    @Override
    public WebAuthenticationDetails buildDetails(HttpServletRequest context) {
        AuthenticationDetails authenticationDetails = new AuthenticationDetails(context);
        branchCode = authenticationDetails.getBranchCode();
        return authenticationDetails;
    }

    public String getBranchCode() {
        return branchCode;
    }
}
