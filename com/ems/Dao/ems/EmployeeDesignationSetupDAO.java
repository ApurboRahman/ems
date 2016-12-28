package com.ems.Dao.ems;

import com.ems.BaseDao.BaseDao;
import com.ems.Entity.ems.EmployeeDesignationSetup;
import com.ems.IDao.ems.IEmployeeDesignationSetupDAO;

/**
 * Created by Apurbo on 11/22/2016.
 */
public class EmployeeDesignationSetupDAO extends BaseDao implements IEmployeeDesignationSetupDAO {

    public void insertEmployeeDesignation(EmployeeDesignationSetup employeeDesignationSetup) {
        em.persist(employeeDesignationSetup);
        em.flush();
    }
}
