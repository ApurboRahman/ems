package com.ems.Service.ems;

import com.ems.Entity.ems.EmployeeWorkHistory;
import com.ems.IDao.ems.IEmployeeWorkHistoryDAO;
import com.ems.IService.ems.IEmployeeWorkHistoryService;
import com.ems.dto.ems.EmployeeWorkHistoryDTO;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by Apurbo on 11/25/2016.
 */
public class EmployeeWorkHistoryService implements IEmployeeWorkHistoryService {

    private IEmployeeWorkHistoryDAO employeeWorkHistoryDAO;

    public void setEmployeeWorkHistoryDAO(IEmployeeWorkHistoryDAO employeeWorkHistoryDAO) {
        this.employeeWorkHistoryDAO = employeeWorkHistoryDAO;
    }

    @Transactional(readOnly = true)
    public void insertEmployeeWorksHistory(EmployeeWorkHistoryDTO employeeWorkHistoryDTO) {
        Date date = new Date();
        EmployeeWorkHistory employeeWorkHistory = new EmployeeWorkHistory();
        employeeWorkHistory.setEmployeeId(employeeWorkHistoryDTO.getEmployeeId());
        employeeWorkHistory.setCompanyName(employeeWorkHistoryDTO.getCompanyName());
        employeeWorkHistory.setJobTitle(employeeWorkHistoryDTO.getJobTitle());
        employeeWorkHistory.setJoiningDate(employeeWorkHistoryDTO.getJoiningDate());
        employeeWorkHistory.setTerminationDate(employeeWorkHistoryDTO.getTerminationDate());
        employeeWorkHistory.setTerminationReason(employeeWorkHistoryDTO.getTerminationReason());
        employeeWorkHistory.setCompanyAddress(employeeWorkHistoryDTO.getCompanyAddress());
        employeeWorkHistory.setContactPerson(employeeWorkHistoryDTO.getContactPerson());
        employeeWorkHistory.setContactNumber(employeeWorkHistoryDTO.getContactNumber());
        employeeWorkHistory.setSetDate(date);
        employeeWorkHistory.setUserName("Apurbo");
        employeeWorkHistory.setApprovedBy("Apurbo");
        employeeWorkHistory.setApprovalRemarks("Approved");
        employeeWorkHistory.setDataStatusFlug('N');
        employeeWorkHistory.setPolicyStatusFlag('N');
        employeeWorkHistoryDAO.insetEmployeeWorkHistory(employeeWorkHistory);

    }
}
