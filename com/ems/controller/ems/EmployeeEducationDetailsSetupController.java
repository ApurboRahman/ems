package com.ems.controller.ems;

import com.ems.IService.ems.IEmployeeEducationDetailsSetupService;
import com.ems.dto.ems.EmployeeEducationDetailsSetupDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Apurbo on 11/26/2016.
 */
@RequestMapping(value = "/")
public class EmployeeEducationDetailsSetupController {

    private IEmployeeEducationDetailsSetupService employeeEducationDetailsSetupService;

    public void setEmployeeEducationDetailsSetupService(IEmployeeEducationDetailsSetupService employeeEducationDetailsSetupService) {
        this.employeeEducationDetailsSetupService = employeeEducationDetailsSetupService;
    }


    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(pure = true)
    @RequestMapping(value = "employeeEducationDetailsSetup")
    public String index(){
        return "ems/employeeEducationDetailsSetup";
    }

    @RequestMapping(value = "saveEmployeeEducationDetails",method = RequestMethod.POST)
    public String save(EmployeeEducationDetailsSetupDTO employeeEducationDetailsSetupDTO){

        employeeEducationDetailsSetupService.insertEmployeeEducationDetails(employeeEducationDetailsSetupDTO);
        return "ems/employeeEducationDetailsSetup";
    }
}
