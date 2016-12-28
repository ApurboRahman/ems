package com.ems.dto.ems;

import java.util.Date;

/**
 * Created by Apurbo on 11/22/2016.
 */
public class EmployeeDesignationSetupDTO {
    Integer employeeDesignationType;
    String shortName;
    String fullName;
    String userName;
    Date setDate;
    String approvedBy;

    public Integer getEmployeeDesignationType() {
        return employeeDesignationType;
    }

    public void setEmployeeDesignationType(Integer employeeDesignationType) {
        this.employeeDesignationType = employeeDesignationType;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getSetDate() {
        return setDate;
    }

    public void setSetDate(Date setDate) {
        this.setDate = setDate;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }
}
