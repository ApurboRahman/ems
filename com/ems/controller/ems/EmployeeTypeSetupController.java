package com.ems.controller.ems;

import com.ems.IService.ems.IEmployeeTypeSetupService;
import com.ems.Service.ems.EmployeeTypeSetupService;
import com.ems.dto.ems.EmployeeTypeSetupDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Apurbo on 11/20/2016.
 */
@RequestMapping(value = "/")
public class EmployeeTypeSetupController {
    private IEmployeeTypeSetupService employeeTypeSetupService;

    public void setEmployeeTypeSetupService(IEmployeeTypeSetupService employeeTypeSetupService) {
        this.employeeTypeSetupService = employeeTypeSetupService;
    }
    @RequestMapping(value = "employeeTypeSetup",method = RequestMethod.GET)
    public String index(){
        return "ems/employeeTypeSetup";
    }


    @RequestMapping(value = "/saveEmployeeType")
    public String save(EmployeeTypeSetupDTO employeeTypeSetupDTO){
        employeeTypeSetupService.insertEmployeeType(employeeTypeSetupDTO);
        return "ems/employeeTypeSetup";
    }
}
