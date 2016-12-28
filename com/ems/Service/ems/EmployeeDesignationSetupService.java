package com.ems.Service.ems;

import com.ems.Entity.ems.EmployeeDesignationSetup;
import com.ems.Entity.ems.EmployeeDesignationSetup_PK;
import com.ems.IDao.ems.IEmployeeDesignationSetupDAO;
import com.ems.IService.ems.IEmployeeDesignationSetupService;
import com.ems.dto.ems.EmployeeDesignationSetupDTO;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Apurbo on 11/22/2016.
 */
public class EmployeeDesignationSetupService implements IEmployeeDesignationSetupService {

    private IEmployeeDesignationSetupDAO employeeDesignationSetupDAO;

    public void setEmployeeDesignationSetupDAO(IEmployeeDesignationSetupDAO employeeDesignationSetupDAO) {
        this.employeeDesignationSetupDAO = employeeDesignationSetupDAO;
    }

    @Transactional(readOnly = true)
    public void insertEmployeeDesignation(EmployeeDesignationSetupDTO employeeDesignationSetupDTO) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        EmployeeDesignationSetup employeeDesignationSetup = new EmployeeDesignationSetup();
        EmployeeDesignationSetup_PK employeeDesignationSetup_pk = new EmployeeDesignationSetup_PK();
        employeeDesignationSetup_pk.setEmployeeDesignationType(employeeDesignationSetupDTO.getEmployeeDesignationType());
        employeeDesignationSetup_pk.setShortName(employeeDesignationSetupDTO.getShortName());
        employeeDesignationSetup.setEmployeeDesignationSetup_pk(employeeDesignationSetup_pk);
        employeeDesignationSetup.setFullName(employeeDesignationSetupDTO.getFullName());
        employeeDesignationSetup.setSetDate(date);
        employeeDesignationSetup.setUserName("Apurbo");
        employeeDesignationSetup.setApprovedBy("Apurbo");
        employeeDesignationSetupDAO.insertEmployeeDesignation(employeeDesignationSetup);
    }
}
