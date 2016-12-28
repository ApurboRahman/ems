package com.ems.Service.ems;

import com.ems.Entity.ems.MaritalStatusSetup;
import com.ems.IDao.ems.IMaritalStatusSetupDAO;
import com.ems.IService.ems.IMaritalStatusSetupService;
import com.ems.dto.ems.MaritalStatusSetupDTO;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Apurbo on 11/21/2016.
 */
public class MaritalStatusSetupService implements IMaritalStatusSetupService {

    private IMaritalStatusSetupDAO maritalStatusSetupDAO;

    public void setMaritalStatusSetupDAO(IMaritalStatusSetupDAO maritalStatusSetupDAO) {
        this.maritalStatusSetupDAO = maritalStatusSetupDAO;
    }

    public void insertMaritalStatus(MaritalStatusSetupDTO maritalStatusSetupDTO) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        MaritalStatusSetup maritalStatusSetup = new MaritalStatusSetup();
        maritalStatusSetup.setStatusId(maritalStatusSetupDTO.getStatusId());
        maritalStatusSetup.setStatusName(maritalStatusSetupDTO.getStatusName());
        maritalStatusSetup.setUserName("Apurbo");
        maritalStatusSetup.setSetDate(date);
        maritalStatusSetup.setApprovedBy("Apurbo");
        maritalStatusSetupDAO.insertMaritalStauts(maritalStatusSetup);
    }
}
