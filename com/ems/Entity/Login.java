package com.ems.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Apurbo on 12/3/2016.
 */
@Entity
@Table(name = "SA_USER")
public class Login {

    @Id
    @Column(name = "USERID")
    private String userId;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "USERNAME")
    private String userName;

    @Column(name = "USERCREATENAME")
    private String userCreateName;

    @Column(name = "CREATEDATE")
    private Date createDate;

    @Column(name = "SETDATE")
    private Date setDate;

    @Column(name = "APPROVEDBY")
    private String approvedBy;

    @Column(name = "APPROVAREMARKS")
    private String approvarRemarks;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCreateName() {
        return userCreateName;
    }

    public void setUserCreateName(String userCreateName) {
        this.userCreateName = userCreateName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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

    public String getApprovarRemarks() {
        return approvarRemarks;
    }

    public void setApprovarRemarks(String approvarRemarks) {
        this.approvarRemarks = approvarRemarks;
    }
}
