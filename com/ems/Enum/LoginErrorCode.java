package com.ems.Enum;

/**
 * Created by Apurbo on 12/11/2016.
 */
public enum LoginErrorCode {
    FAILED("userLogin.failed"),
    LOCKED("userLogin.locked"),
    MAX_SESSION("userLogin.maxSession");
    private final String code;

    LoginErrorCode(String code) {
        this.code = code;
    }
    public String getCode(){
        return code;
    }
}
