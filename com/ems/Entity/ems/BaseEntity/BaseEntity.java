package com.ems.Entity.ems.BaseEntity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Created by Apurbo on 11/22/2016.
 */
@MappedSuperclass
public class BaseEntity {



    @Column(name = "USERNAME")
   private String userName;

    @DateTimeFormat
    @Column(name = "SETDATE" ,columnDefinition="Date")
    private Date setDate;

    @Column(name = "APPROVEDBY")
    private String approvedBy;

    @Column(name = "APPROVALREMARKS")
    private String approvalRemarks;

    @Column(name = "DATASTATSUSFLUG")
    private Character dataStatusFlug;

    @Column(name = "PLOICYSTATUSFLAG")
    private Character policyStatusFlag;
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

    public String getApprovalRemarks() {
        return approvalRemarks;
    }

    public void setApprovalRemarks(String approvalRemarks) {
        this.approvalRemarks = approvalRemarks;
    }

    public Character getDataStatusFlug() {
        return dataStatusFlug;
    }

    public void setDataStatusFlug(Character dataStatusFlug) {
        this.dataStatusFlug = dataStatusFlug;
    }

    public Character getPolicyStatusFlag() {
        return policyStatusFlag;
    }

    public void setPolicyStatusFlag(Character policyStatusFlag) {
        this.policyStatusFlag = policyStatusFlag;
    }
}

