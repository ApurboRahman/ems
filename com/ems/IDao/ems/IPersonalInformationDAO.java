package com.ems.IDao.ems;

import com.ems.Entity.ems.PersonalInformationEntity;
import com.ems.dto.ems.PersonalInformationDTO;

import java.util.List;

/**
 * Created by Apurbo on 11/18/2016.
 */
public interface IPersonalInformationDAO {
    public void insertPersonalInformation(PersonalInformationEntity personalInformationEntity);
    public List<PersonalInformationDTO> personalInformationDetails();
}
