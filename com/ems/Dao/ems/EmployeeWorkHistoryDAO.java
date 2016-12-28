package com.ems.Dao.ems;

import com.ems.BaseDao.BaseDao;
import com.ems.Entity.ems.EmployeeWorkHistory;
import com.ems.IDao.ems.IEmployeeWorkHistoryDAO;
import com.ems.IService.ems.IEmployeeWorkHistoryService;

/**
 * Created by Apurbo on 11/25/2016.
 */
public class EmployeeWorkHistoryDAO extends BaseDao implements IEmployeeWorkHistoryDAO {
    public void insetEmployeeWorkHistory(EmployeeWorkHistory employeeWorkHistory) {
        em.persist(employeeWorkHistory);
        em.flush();
    }
}
