package com.ems.Entity.ems;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Apurbo on 11/20/2016.
 */
@Entity
@Table(name = "GENDERSETUP")
public class GenderSetup {
    @Id
    @Column(name = "SHORTNAME")
    private Character shortName;
    @Column(name = "FULLNAME")
    private String fullName;

    @Column(name = "USERNAME")
    private String userName;
    @Column(name = "SETDATE")
    private Date setDate;
    @Column(name = "APPROVEDBY")
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
