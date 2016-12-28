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
@Table(name = "EMPLOYEETYPE")
public class EmployeeTypeSetup {
    @Id
    @Column(name = "EMPLOYEETYPEID")
    private Integer employeeTypeId;

    @Column(name = "TYPENAME")
    private String typeName;

    @Column(name = "USERNAME")
    private String userName;

    @Column(name = "SETDATE")
    private Date setDate;

    @Column(name = "APPROVEDBY")
    private String approvedBy;

    public Integer getEmployeeTypeId() {
        return employeeTypeId;
    }

    public void setEmployeeTypeId(Integer employeeTypeId) {
        this.employeeTypeId = employeeTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
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
