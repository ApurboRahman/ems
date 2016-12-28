package com.ems.Dao.ems;

import com.ems.BaseDao.BaseDao;
import com.ems.Entity.ems.DepartmentSetup;
import com.ems.IDao.ems.IDepartmentSetupDAO;

/**
 * Created by Apurbo on 11/23/2016.
 */
public class DepartmentSetupDAO extends BaseDao implements IDepartmentSetupDAO{
    public void insertDepartment(DepartmentSetup departmentSetup) {
        em.persist(departmentSetup);
        em.flush();
    }
}
