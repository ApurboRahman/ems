package com.ems.IService;

import com.ems.dto.AccessPermissionDTO;
import com.ems.dto.LoginDTO;

import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by Apurbo on 12/3/2016.
 */
public interface ILoginSerivice {

    public Boolean loginSuccess(String userId, String password);

    public Boolean keepLoginRecord(String username, String branchCode, String workStatioIp);

    public LoginDTO login(String username, String branchCode);

    public boolean isPasswordExpired(String username, String branchCode);
    public boolean isFirstTimeLogin(String username);

    public Date getSystemOpenDate(String branchCode);

    public List<AccessPermissionDTO> getUseGroupWiseAccessPermissionList(String groupId);

    Collection<? extends AccessPermissionDTO> getUserWiseAdditionalPermissionList(String userName, Date systemOpenDate);
}
