package com.ems.Entity.ems;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Apurbo on 11/26/2016.
 */
@Embeddable
public class EmployeeEducationDetailsSetup_PK implements Serializable{

    @Column(name = "EEDEMPLOYEEID")
    private Integer employeeId;

    @Column(name = "EEDEXAMNAME")
    private String examName;

    public EmployeeEducationDetailsSetup_PK() {
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public EmployeeEducationDetailsSetup_PK(Integer employeeId, String examName) {
        this.employeeId = employeeId;
        this.examName = examName;
    }
}

