package com.ems.Service.ems;

import com.ems.Entity.ems.DepartmentSetup;
import com.ems.Entity.ems.DepartmentSetup_PK;
import com.ems.IDao.ems.IDepartmentSetupDAO;
import com.ems.IService.ems.IDepartmentSetupService;
import com.ems.dto.ems.DepartmentSetupDTO;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Apurbo on 11/23/2016.
 */
public class DepartmentSetupService implements IDepartmentSetupService {
    private IDepartmentSetupDAO departmentSetupDAO;

    public void setDepartmentSetupDAO(IDepartmentSetupDAO departmentSetupDAO) {
        this.departmentSetupDAO = departmentSetupDAO;
    }

    @Transactional(readOnly = true)
    public void insertDepartment(DepartmentSetupDTO departmentSetupDTO) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        DepartmentSetup departmentSetup = new DepartmentSetup();
        DepartmentSetup_PK departmentSetup_pk = new DepartmentSetup_PK();
        departmentSetup_pk.setDepartmentId(departmentSetupDTO.getDepartmentId());
        departmentSetup_pk.setDeptShortName(departmentSetupDTO.getDeptShortName());
        departmentSetup.setDepartmentSetup_pk(departmentSetup_pk);
        departmentSetup.setDeptFullName(departmentSetupDTO.getDeptFullName());
        departmentSetup.setDepartmentType(departmentSetupDTO.getDepartmentType());
        departmentSetup.setDeptCreateDate(departmentSetupDTO.getDeptCreateDate());
        departmentSetup.setDeptDescription(departmentSetupDTO.getDeptDescription());
        departmentSetup.setSetDate(date);
        departmentSetup.setUserName("Apurbo");
        departmentSetup.setApprovedBy("Apurbo");
        departmentSetup.setApprovalRemarks("Approved");
        departmentSetup.setDataStatusFlug('N');
        departmentSetup.setPolicyStatusFlag('N');
        departmentSetupDAO.insertDepartment(departmentSetup);


    }
}
