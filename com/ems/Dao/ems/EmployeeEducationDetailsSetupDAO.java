package com.ems.Dao.ems;

import com.ems.BaseDao.BaseDao;
import com.ems.Entity.ems.EmployeeEducationDetailsSetup;
import com.ems.IDao.ems.IEmployeeEducationDetailsSetupDAO;

/**
 * Created by Apurbo on 11/26/2016.
 */
public class EmployeeEducationDetailsSetupDAO extends BaseDao implements IEmployeeEducationDetailsSetupDAO{
    public void insertEmployeeDesignation(EmployeeEducationDetailsSetup employeeEducationDetailsSetup) {
        em.persist(employeeEducationDetailsSetup);
        em.flush();
    }
}
