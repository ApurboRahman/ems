package com.ems.IDao;

import com.ems.dto.LoginDTO;

/**
 * Created by Apurbo on 12/3/2016.
 */
public interface ILoginDAO {

    public Boolean logInUser(String userId, String password);

   public Boolean keepLoginRecord(String username, String branchCode, String workStatioIp);

    public LoginDTO login(String username, String branchCode);
}
