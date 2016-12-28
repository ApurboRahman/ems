package com.ems.dto;

/**
 * Created by Apurbo on 12/3/2016.
 */
public class LoginDTO {
    private String userName;
    private String branchCode;

    private int sessionTimeOut;
    Boolean keepLoginRecordYN;
    public boolean enabled;
    public String password;
    public boolean changePasswordYN;
    public String groupId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public int getSessionTimeOut() {
        return sessionTimeOut;
    }

    public void setSessionTimeOut(int sessionTimeOut) {
        this.sessionTimeOut = sessionTimeOut;
    }

    public Boolean getKeepLoginRecordYN() {
        return keepLoginRecordYN;
    }

    public void setKeepLoginRecordYN(Boolean keepLoginRecordYN) {
        this.keepLoginRecordYN = keepLoginRecordYN;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isChangePasswordYN() {
        return changePasswordYN;
    }

    public void setChangePasswordYN(boolean changePasswordYN) {
        this.changePasswordYN = changePasswordYN;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
