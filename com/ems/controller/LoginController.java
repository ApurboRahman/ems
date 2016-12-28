package com.ems.controller;

import com.ems.IService.ILoginSerivice;
import com.ems.dto.CurrentUser;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Apurbo on 12/3/2016.
 */
@RequestMapping(value = "/")
public class LoginController {
    private ILoginSerivice loginSerivice;

    public void setLoginSerivice(ILoginSerivice loginSerivice) {
        this.loginSerivice = loginSerivice;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String index() {
        return "login-logout";
    }

    @RequestMapping(value = "/home")
    public String loginSuccess(Model model, String userId, String password) {
        CurrentUser currentUser = new CurrentUser();
        currentUser.setUser(userId);
        model.addAttribute("userId", userId);
        Boolean success = false;
        success = loginSerivice.loginSuccess(userId, password);
        if (success)
            return "index";

        return "login-logout";
    }


    @RequestMapping(value = "/logOut", method = RequestMethod.GET)
    public String logOut() {
        return "login-logout";
    }
}
