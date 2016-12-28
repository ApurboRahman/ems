package com.ems.controller.ems;

import com.ems.IService.ems.IDepartmentSetupService;
import com.ems.dto.ems.DepartmentSetupDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Apurbo on 11/23/2016.
 */
@RequestMapping(value = "/")
public class DepartmentSetupController {
    private IDepartmentSetupService departmentSetupService;

    public void setDepartmentSetupService(IDepartmentSetupService departmentSetupService) {
        this.departmentSetupService = departmentSetupService;
    }

    @RequestMapping(value = "departmentSetup")
    public String index(){
        return "ems/departmentSetup";
    }

    @RequestMapping(value = "saveDepartmentSetup",method = RequestMethod.POST)
    public  String save (DepartmentSetupDTO departmentSetupDTO){
        departmentSetupService.insertDepartment(departmentSetupDTO);
        return "ems/departmentSetup";
    }
}
