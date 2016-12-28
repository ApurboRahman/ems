package com.ems.Service.ems;

import com.ems.Entity.ems.GenderSetup;
import com.ems.IDao.ems.IGenderSetupDAO;
import com.ems.IService.ems.IGenderSetupService;
import com.ems.dto.ems.GenderSetupDTO;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Apurbo on 11/20/2016.
 */
public class GenderSetupService implements IGenderSetupService {
    private IGenderSetupDAO genderSetupDAO;

    public void setGenderSetupDAO(IGenderSetupDAO genderSetupDAO) {
        this.genderSetupDAO = genderSetupDAO;
    }

    @Transactional(readOnly = true)
    public void insertGender(GenderSetupDTO genderSetupDTO) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        GenderSetup genderSetup = new GenderSetup();
        genderSetup.setShortName(genderSetupDTO.getShortName());
        genderSetup.setFullName(genderSetupDTO.getFullName());
        genderSetup.setSetDate(date);
        genderSetup.setUserName("Apurbo");
        genderSetup.setApprovedBy("Apurbo");
        genderSetupDAO.insertGender(genderSetup);
    }
}
