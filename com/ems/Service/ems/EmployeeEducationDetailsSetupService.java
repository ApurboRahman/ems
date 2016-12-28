package com.ems.Service.ems;

import com.ems.Entity.ems.EmployeeEducationDetailsSetup;
import com.ems.Entity.ems.EmployeeEducationDetailsSetup_PK;
import com.ems.IDao.ems.IEmployeeDesignationSetupDAO;
import com.ems.IDao.ems.IEmployeeEducationDetailsSetupDAO;
import com.ems.IService.ems.IEmployeeEducationDetailsSetupService;
import com.ems.dto.ems.EmployeeEducationDetailsSetupDTO;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Apurbo on 11/26/2016.
 */
public class EmployeeEducationDetailsSetupService implements IEmployeeEducationDetailsSetupService {

    private IEmployeeEducationDetailsSetupDAO employeeEducationDetailsSetupDAO;

    public void setEmployeeEducationDetailsSetupDAO(IEmployeeEducationDetailsSetupDAO employeeEducationDetailsSetupDAO) {
        this.employeeEducationDetailsSetupDAO = employeeEducationDetailsSetupDAO;
    }

    @Transactional(readOnly = true)
    public void insertEmployeeEducationDetails(EmployeeEducationDetailsSetupDTO employeeEducationDetailsSetupDTO) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();


        EmployeeEducationDetailsSetup employeeEducationDetailsSetup = new EmployeeEducationDetailsSetup();
        EmployeeEducationDetailsSetup_PK employeeEducationDetailsSetup_pk = new EmployeeEducationDetailsSetup_PK();
        employeeEducationDetailsSetup_pk.setEmployeeId(employeeEducationDetailsSetupDTO.getEmployeeId());
        employeeEducationDetailsSetup_pk.setExamName(employeeEducationDetailsSetupDTO.getExamName());
        employeeEducationDetailsSetup.setEmployeeEducationDetailsSetup_pk(employeeEducationDetailsSetup_pk);
        employeeEducationDetailsSetup.setSubjectName(employeeEducationDetailsSetupDTO.getSubjectName());
        employeeEducationDetailsSetup.setDuration(employeeEducationDetailsSetupDTO.getDuration());
        employeeEducationDetailsSetup.setResult(employeeEducationDetailsSetupDTO.getResult());
        employeeEducationDetailsSetup.setPassingYear(employeeEducationDetailsSetupDTO.getPassingYear());
        employeeEducationDetailsSetup.setUniversityName(employeeEducationDetailsSetupDTO.getUniversityName());
        employeeEducationDetailsSetup.setRollNumber(employeeEducationDetailsSetupDTO.getRollNumber());
        employeeEducationDetailsSetup.setRegistrationNumber(employeeEducationDetailsSetupDTO.getRegistrationNumber());
        employeeEducationDetailsSetup.setUserName("Apurbo");
        employeeEducationDetailsSetup.setSetDate(date);
        employeeEducationDetailsSetup.setApprovedBy("Apurbo");
        employeeEducationDetailsSetup.setApprovalRemarks("Aproved");
        employeeEducationDetailsSetup.setDataStatusFlug('N');
        employeeEducationDetailsSetup.setPolicyStatusFlag('N');
        employeeEducationDetailsSetupDAO.insertEmployeeDesignation(employeeEducationDetailsSetup);

    }
}
