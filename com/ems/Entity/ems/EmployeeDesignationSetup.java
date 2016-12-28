package com.ems.Entity.ems;

import com.ems.Entity.ems.BaseEntity.BaseEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Apurbo on 11/22/2016.
 */
@Entity
@Table(name = "EMPLOYEEDESIGNATIONSETUP")
public class EmployeeDesignationSetup extends BaseEntity{
    @EmbeddedId
    EmployeeDesignationSetup_PK employeeDesignationSetup_pk;
    @Column(name = "FULLNAME")
    String fullName;


    public EmployeeDesignationSetup_PK getEmployeeDesignationSetup_pk() {
        return employeeDesignationSetup_pk;
    }

    public void setEmployeeDesignationSetup_pk(EmployeeDesignationSetup_PK employeeDesignationSetup_pk) {
        this.employeeDesignationSetup_pk = employeeDesignationSetup_pk;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
