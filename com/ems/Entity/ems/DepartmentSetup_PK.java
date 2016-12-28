package com.ems.Entity.ems;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Apurbo on 11/25/2016.
 */
@Embeddable
public class DepartmentSetup_PK implements Serializable{

    @Column(name = "DEPTID")
    private Integer departmentId;

    @Column(name = "DEPTSHORTNAME")
    private String deptShortName;

    public DepartmentSetup_PK() {
    }

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

    public DepartmentSetup_PK(Integer departmentId, String deptShortName) {
        this.departmentId = departmentId;
        this.deptShortName = deptShortName;
    }
}
