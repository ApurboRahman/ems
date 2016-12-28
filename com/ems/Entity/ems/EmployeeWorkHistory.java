package com.ems.Entity.ems;

import com.ems.Entity.ems.BaseEntity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.jar.Attributes;

/**
 * Created by Apurbo on 11/25/2016.
 */
@Entity
@Table(name = "EMPLOYEEWORKHISTORY")
public class EmployeeWorkHistory extends BaseEntity {
    @Id
    @Column(name = "EWHEMPLOYEEID")
    private Integer employeeId;

    @Column(name = "EWHCOMPANYNAME")
    private String companyName;

    @Column(name = "EWHJOBTITLE")
    private String jobTitle;

    @Column(name = "EWHJOININGDATE")
    private Date joiningDate;

    @Column(name = "EWHTERMINATIONDATE")
    private Date terminationDate;

    @Column(name = "EWHTERMINATIONREASON")
    private String terminationReason;

    @Column(name = "EWHCOMPANYADDRESS")
    private String companyAddress;

    @Column(name = "EWHCONTACTPERSON")
    private String contactPerson;

    @Column(name = "EWHCONTACTNUMBER")
    private String contactNumber;


    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public Date getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(Date terminationDate) {
        this.terminationDate = terminationDate;
    }

    public String getTerminationReason() {
        return terminationReason;
    }

    public void setTerminationReason(String terminationReason) {
        this.terminationReason = terminationReason;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }


}
