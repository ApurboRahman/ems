package com.security;

import org.springframework.security.web.authentication.WebAuthenticationDetails;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Apurbo on 12/7/2016.
 */
public class AuthenticationDetails extends WebAuthenticationDetails {
    private final String branchCode;

    public AuthenticationDetails(HttpServletRequest request) {
        super(request);
        branchCode = request.getParameter("branchCode");
    }

    public String getBranchCode() {
        return branchCode;
    }
}
