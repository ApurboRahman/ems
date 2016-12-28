package com.security;


import com.ems.IService.ILoginSerivice;
import com.ems.dto.LoginDTO;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Apurbo on 12/7/2016.
 */
public class LoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
    private ILoginSerivice loginSerivice;

    public void setLoginSerivice(ILoginSerivice loginSerivice) {
        this.loginSerivice = loginSerivice;
    }

    public LoginSuccessHandler(String defaultTargetUrl) {
        super(defaultTargetUrl);
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        super.onAuthenticationSuccess(request, response, authentication);
        LoginDTO user = (LoginDTO) authentication.getPrincipal();
        HttpSession session = request.getSession(true);
        int sessionTimeOut = user.getSessionTimeOut() * 60;
        session.setMaxInactiveInterval(sessionTimeOut);

        if (user.getKeepLoginRecordYN()) {
            String workStationIp = request.getRemoteAddr();
            loginSerivice.keepLoginRecord(user.getUserName(),user.getBranchCode(),workStationIp);

        }
    }
}
