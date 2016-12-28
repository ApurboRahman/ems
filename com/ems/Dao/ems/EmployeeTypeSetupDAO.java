package com.ems.Dao.ems;

import com.ems.BaseDao.BaseDao;
import com.ems.Entity.ems.EmployeeTypeSetup;
import com.ems.IDao.ems.IEmployeeTypeSetupDAO;

/**
 * Created by Apurbo on 11/20/2016.
 */
public class EmployeeTypeSetupDAO extends BaseDao implements IEmployeeTypeSetupDAO {
    public void insertEmployeeType(EmployeeTypeSetup employeeTypeSetup) {
        em.persist(employeeTypeSetup);
        em.flush();
    }
}
