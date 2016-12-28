package com.ems.Service;

import com.ems.IDao.ILoginDAO;
import com.ems.IService.ILoginSerivice;
import com.ems.dto.AccessPermissionDTO;
import com.ems.dto.LoginDTO;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by Apurbo on 12/3/2016.
 */
public class LoginSerivice implements ILoginSerivice {

    public ILoginDAO loginDAO;

    public void setLoginDAO(ILoginDAO loginDAO) {
        this.loginDAO = loginDAO;
    }

    @Transactional(readOnly = true)
    public Boolean loginSuccess(String userId, String password) {

        return loginDAO.logInUser(userId,password);
    }

    @Override
    public Boolean keepLoginRecord(String username, String branchCode, String workStatioIp) {
        return loginDAO.keepLoginRecord(username,branchCode,workStatioIp);
    }

    @Override
    public LoginDTO login(String username, String branchCode) {
        return loginDAO.login(username,branchCode);
    }

    @Override
    public boolean isPasswordExpired(String username, String branchCode) {
        return false;
    }

    @Override
    public boolean isFirstTimeLogin(String username) {
        return false;
    }

    @Override
    public Date getSystemOpenDate(String branchCode) {
        return null;
    }

    @Override
    public List<AccessPermissionDTO> getUseGroupWiseAccessPermissionList(String groupId) {
        return null;
    }

    @Override
    public Collection<? extends AccessPermissionDTO> getUserWiseAdditionalPermissionList(String userName, Date systemOpenDate) {
        return null;
    }
}
