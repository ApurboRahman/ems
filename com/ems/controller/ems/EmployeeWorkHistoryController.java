package com.ems.controller.ems;

import com.ems.IService.ems.IEmployeeWorkHistoryService;
import com.ems.dto.ems.EmployeeWorkHistoryDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Apurbo on 11/25/2016.
 */
@RequestMapping(value = "/")
public class EmployeeWorkHistoryController {
    private IEmployeeWorkHistoryService employeeWorkHistoryService;

    public void setEmployeeWorkHistoryService(IEmployeeWorkHistoryService employeeWorkHistoryService) {
        this.employeeWorkHistoryService = employeeWorkHistoryService;
    }

    @RequestMapping(value = "employeeWorkHistory",method = RequestMethod.GET)
    public String inedex() {
        return "ems/employeeWorkHistory";
    }

    @RequestMapping(value = "saveEmployeeWorkHistory",method = RequestMethod.POST)
    public String saveEmployeeWorkHistory(EmployeeWorkHistoryDTO employeeWorkHistoryDTO){
        employeeWorkHistoryService.insertEmployeeWorksHistory(employeeWorkHistoryDTO);
        return "ems/employeeWorkHistory";
    }
}
