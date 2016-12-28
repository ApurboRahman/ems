package com.ems.Service.ems;


import com.ems.Entity.ems.EmployeeTypeSetup;
import com.ems.IDao.ems.IEmployeeTypeSetupDAO;
import com.ems.dto.ems.EmployeeTypeSetupDTO;
import com.ems.IService.ems.IEmployeeTypeSetupService;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Apurbo on 11/20/2016.
 */
public class EmployeeTypeSetupService implements IEmployeeTypeSetupService {
    private IEmployeeTypeSetupDAO employeeTypeSetupDAO;

    public void setEmployeeTypeSetupDAO(IEmployeeTypeSetupDAO employeeTypeSetupDAO) {
        this.employeeTypeSetupDAO = employeeTypeSetupDAO;
    }

    @Transactional(readOnly = true)
    public void insertEmployeeType(EmployeeTypeSetupDTO employeeTypeSetupDTO) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        EmployeeTypeSetup employeeTypeSetup = new EmployeeTypeSetup();
        employeeTypeSetup.setEmployeeTypeId(employeeTypeSetupDTO.getEmployeeTypeId());
        employeeTypeSetup.setTypeName(employeeTypeSetupDTO.getTypeName());
        employeeTypeSetup.setUserName("Apurbo");
        employeeTypeSetup.setSetDate(date);
        employeeTypeSetup.setApprovedBy("Apurbo");
        employeeTypeSetupDAO.insertEmployeeType(employeeTypeSetup);
    }
}
