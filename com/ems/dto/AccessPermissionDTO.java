package com.ems.dto;

/**
 * Created by Apurbo on 12/11/2016.
 */
public class AccessPermissionDTO {
    private String screenId;
    private boolean isViewAccessAllowed;
    private boolean isAddAccessAllowed;
    private boolean isEditAccessAllowed;
    private boolean isDeleteAccessAllowed;

    public String getScreenId() {
        return screenId;
    }

    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    public boolean isViewAccessAllowed() {
        return isViewAccessAllowed;
    }

    public void setViewAccessAllowed(boolean viewAccessAllowed) {
        isViewAccessAllowed = viewAccessAllowed;
    }

    public boolean isAddAccessAllowed() {
        return isAddAccessAllowed;
    }

    public void setAddAccessAllowed(boolean addAccessAllowed) {
        isAddAccessAllowed = addAccessAllowed;
    }

    public boolean isEditAccessAllowed() {
        return isEditAccessAllowed;
    }

    public void setEditAccessAllowed(boolean editAccessAllowed) {
        isEditAccessAllowed = editAccessAllowed;
    }

    public boolean isDeleteAccessAllowed() {
        return isDeleteAccessAllowed;
    }

    public void setDeleteAccessAllowed(boolean deleteAccessAllowed) {
        isDeleteAccessAllowed = deleteAccessAllowed;
    }
}
