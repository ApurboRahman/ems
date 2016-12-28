package com.ems.controller.ems;

import com.ems.IService.ems.IGenderSetupService;
import com.ems.dto.ems.GenderSetupDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Apurbo on 11/20/2016.
 */
@RequestMapping(value = "/")
public class GenderSetupController {
    private IGenderSetupService genderSetupService;

    public void setGenderSetupService(IGenderSetupService genderSetupService) {
        this.genderSetupService = genderSetupService;
    }


    @RequestMapping(value = "genderSetup", method = RequestMethod.GET)
    public String index() {
        return "ems/genderSetup";
    }
    @RequestMapping(value = "/saveGender")
    public String save(GenderSetupDTO genderSetupDTO){
        genderSetupService.insertGender(genderSetupDTO);
        return "ems/genderSetup";
    }
}
