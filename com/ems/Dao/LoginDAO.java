package com.ems.Dao;

import com.ems.BaseDao.BaseDao;
import com.ems.IDao.ILoginDAO;
import com.ems.dto.LoginDTO;

/**
 * Created by Apurbo on 12/3/2016.
 */
public class LoginDAO extends BaseDao implements ILoginDAO{

    public Boolean logInUser(String userId, String password) {
        String query = properties.getProperty("LoginDao.logInUser");
        org.hibernate.Query hQuery = hibernateQuery(query)
       .setParameter("userId",userId)
       .setParameter("password",password);
        Integer loginSuccess = (Integer) hQuery.list().get(0);
        if (loginSuccess==1)
            return true;
        return false;
    }

    @Override
    public Boolean keepLoginRecord(String username, String branchCode, String workStatioIp) {
        return null;
    }

    @Override
    public LoginDTO login(String username, String branchCode) {
        return null;
    }
}
