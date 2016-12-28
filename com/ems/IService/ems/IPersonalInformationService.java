package com.ems.IService.ems;

import com.ems.Entity.ems.PersonalInformationEntity;
import com.ems.dto.ems.PersonalInformationDTO;

import java.util.List;

/**
 * Created by Apurbo on 11/18/2016.
 */
public interface IPersonalInformationService {
    public void insertPersonalInformation(PersonalInformationDTO personalInformationDTO);
    public List<PersonalInformationDTO> personalInformationDetails();
}
