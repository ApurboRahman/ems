package com.ems.controller.ems;

import com.ems.Service.ems.MaritalStatusSetupService;
import com.ems.dto.ems.MaritalStatusSetupDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Apurbo on 11/21/2016.
 */
@RequestMapping(value = "/")
public class MaritalStatusSetupController {
private MaritalStatusSetupService maritalStatusSetupService;

    public void setMaritalStatusSetupService(MaritalStatusSetupService maritalStatusSetupService) {
        this.maritalStatusSetupService = maritalStatusSetupService;
    }

    @RequestMapping(value = "maritalStatusSetup", method = RequestMethod.GET)
    public String index() {
        return "ems/maritalStatusSetup";
    }

    @RequestMapping(value = "saveMaritalStatus")
    public String save(MaritalStatusSetupDTO maritalStatusSetupDTO){
        maritalStatusSetupService.insertMaritalStatus(maritalStatusSetupDTO);
        return "ems/maritalStatusSetup";
    }
}

