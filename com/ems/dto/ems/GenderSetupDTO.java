package com.ems.dto.ems;

import java.util.Date;

/**
 * Created by Apurbo on 11/20/2016.
 */
public class GenderSetupDTO {
    private Character shortName;
    private String fullName;
    private String userName;
    private Date setDate;
    private String approvedBy;

    public Character getShortName() {
        return shortName;
    }

    public void setShortName(Character shortName) {
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
