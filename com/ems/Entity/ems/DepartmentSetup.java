package com.ems.Entity.ems;

import com.ems.Entity.ems.BaseEntity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Apurbo on 11/23/2016.
 */
@Entity
@Table(name = "DEPARTMENTSETUP")
public class DepartmentSetup extends BaseEntity {

    @EmbeddedId
    DepartmentSetup_PK departmentSetup_pk;
    @Column(name = "DEPTFULLNAME")
    private String deptFullName;

    @Column(name = "DEPTTYPE")
    private String departmentType;

    @Column(name = "DEPTCREATEDATE")
    private Date deptCreateDate;

    @Column(name = "DEPTDESCRIPTION")
    private String deptDescription;


    public DepartmentSetup_PK getDepartmentSetup_pk() {
        return departmentSetup_pk;
    }

    public void setDepartmentSetup_pk(DepartmentSetup_PK departmentSetup_pk) {
        this.departmentSetup_pk = departmentSetup_pk;
    }

    public String getDeptFullName() {
        return deptFullName;
    }

    public void setDeptFullName(String deptFullName) {
        this.deptFullName = deptFullName;
    }

    public String getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(String departmentType) {
        this.departmentType = departmentType;
    }

    public Date getDeptCreateDate() {
        return deptCreateDate;
    }

    public void setDeptCreateDate(Date deptCreateDate) {
        this.deptCreateDate = deptCreateDate;
    }

    public String getDeptDescription() {
        return deptDescription;
    }

    public void setDeptDescription(String deptDescription) {
        this.deptDescription = deptDescription;
    }
}
