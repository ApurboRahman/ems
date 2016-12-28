package com.ems.controller.ems;

import com.ems.IService.ems.IEmployeeDesignationSetupService;
import com.ems.Service.ems.EmployeeDesignationSetupService;
import com.ems.dto.ems.EmployeeDesignationSetupDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Apurbo on 11/22/2016.
 */
@RequestMapping(value = "/")
public class EmployeeDesignationSetupController {

    private IEmployeeDesignationSetupService employeeDesignationSetupService;

    public void setEmployeeDesignationSetupService(IEmployeeDesignationSetupService employeeDesignationSetupService) {
        this.employeeDesignationSetupService = employeeDesignationSetupService;
    }

    @RequestMapping(value = "employeeDesignationSetup", method = RequestMethod.GET)
    public String index() {
        return "ems/employeeDesignationSetup";
    }

    @RequestMapping(value = "saveEmployeeDesignation")
    public String save(EmployeeDesignationSetupDTO employeeDesignationSetupDTO) {
        employeeDesignationSetupService.insertEmployeeDesignation(employeeDesignationSetupDTO);
        return "ems/employeeDesignationSetup";
    }

}
