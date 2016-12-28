package com.ems.Entity.ems;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Apurbo on 11/22/2016.
 */
@Embeddable
public class EmployeeDesignationSetup_PK implements Serializable {
    @Column(name = "DESIGNATIONTYPEID")
    Integer employeeDesignationType;
    @Column(name = "SHORTNAME")
    String shortName;

    public EmployeeDesignationSetup_PK(Integer employeeDesignationType, String shortName) {
        this.employeeDesignationType = employeeDesignationType;
        this.shortName = shortName;
    }

    public EmployeeDesignationSetup_PK() {
    }

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
}
