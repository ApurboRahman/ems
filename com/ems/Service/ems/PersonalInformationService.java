package com.ems.Service.ems;

import com.ems.Entity.ems.PersonalInformationEntity;
import com.ems.IDao.ems.IPersonalInformationDAO;
import com.ems.IService.ems.IPersonalInformationService;
import com.ems.dto.ems.PersonalInformationDTO;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Apurbo on 11/18/2016.
 */

public class PersonalInformationService implements IPersonalInformationService {
    private IPersonalInformationDAO personalInformationDAO;

    public void setPersonalInformationDAO(IPersonalInformationDAO personalInformationDAO) {
        this.personalInformationDAO = personalInformationDAO;
    }


    @Transactional(readOnly = true)
    public void insertPersonalInformation(PersonalInformationDTO personalInformationDTO) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        PersonalInformationEntity personalInformationEntity = new PersonalInformationEntity();
        String idNumber = personalInformationDTO.getPersonalIdNumber().trim();
        if(idNumber.length()!= 4){
            idNumber = "0".concat(idNumber);
        }

        personalInformationEntity.setPersonalIdNumber(idNumber);

        personalInformationEntity.setFirstName(personalInformationDTO.getFirstName());
        personalInformationEntity.setMiddleName(personalInformationDTO.getMiddleName());
        personalInformationEntity.setLastName(personalInformationDTO.getLastName());
        personalInformationEntity.setDateOfBirth(personalInformationDTO.getDateOfBirth());
        personalInformationEntity.setCellPhone(personalInformationDTO.getCellPhone());
        personalInformationEntity.setHomePhone(personalInformationDTO.getHomePhone());
        personalInformationEntity.setEmail(personalInformationDTO.getEmail());
        personalInformationEntity.setAddress(personalInformationDTO.getAddress());
        personalInformationEntity.setCity(personalInformationDTO.getCity());
        personalInformationEntity.setPostalCode(personalInformationDTO.getPostalCode());
        personalInformationEntity.setGender(personalInformationDTO.getGender());
        personalInformationEntity.setMaritalStatus(personalInformationDTO.getMaritalStatus());
        personalInformationEntity.setSetDate(date);
        personalInformationEntity.setUserName("Apurbo");
        personalInformationEntity.setApprovedBy("Apurbo");
        personalInformationDAO.insertPersonalInformation(personalInformationEntity);

    }

    @Transactional(readOnly = true)
    public List<PersonalInformationDTO> personalInformationDetails() {
        return personalInformationDAO.personalInformationDetails();
    }
}
