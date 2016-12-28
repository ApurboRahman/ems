package com.ems.Entity.ems;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Apurbo on 11/21/2016.
 */
@Entity
@Table(name = "MARITALSTATUS")
public class MaritalStatusSetup {
    @Id
    @Column(name = "STATUSID")
    private Integer statusId;

    @Column(name = "STATUSNAME")
    private String statusName;

    @Column(name = "USERNAME")
    private String userName;

    @Column(name = "SETDATE")
    private Date setDate;

    @Column(name = "APPROVEDBY")
    private String approvedBy;

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
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
