package com.ems.Entity.ems;

import com.ems.Entity.ems.BaseEntity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Apurbo on 11/26/2016.
 */
@Entity
@Table(name = "EMPLOYEEEDUCATIONDETAILS")
public class EmployeeEducationDetailsSetup extends BaseEntity {

    @EmbeddedId
    EmployeeEducationDetailsSetup_PK employeeEducationDetailsSetup_pk;
    @Column(name = "EEDSUBJECTNAME")
    private String subjectName;

    @Column(name = "EEDDURATION")
    private String duration;

    @Column(name = "EEDRESULT")
    private String result;

    @Column(name = "EEDPASSINGYEAR")
    private String passingYear;

    @Column(name = "EEDUNIVERSITY")
    private String universityName;

    @Column(name = "EEDROLLNUMBER")
    private String rollNumber;

    @Column(name = "EEDREGISTRATIONNUMBER")
    private String registrationNumber;


    public void setEmployeeEducationDetailsSetup_pk(EmployeeEducationDetailsSetup_PK employeeEducationDetailsSetup_pk) {
        this.employeeEducationDetailsSetup_pk = employeeEducationDetailsSetup_pk;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getPassingYear() {
        return passingYear;
    }

    public void setPassingYear(String passingYear) {
        this.passingYear = passingYear;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
