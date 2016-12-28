package com.ems.dto.ems;

import java.util.Date;

/**
 * Created by Apurbo on 11/25/2016.
 */
public class DepartmentSetupDTO {
    private Integer departmentId;
    private String deptShortName;
    private String deptFullName;
    private String departmentType;
    private Date deptCreateDate;
    private String deptDescription;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDeptShortName() {
        return deptShortName;
    }

    public void setDeptShortName(String deptShortName) {
        this.deptShortName = deptShortName;
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
