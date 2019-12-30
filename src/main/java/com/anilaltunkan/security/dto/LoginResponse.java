package com.anilaltunkan.security.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: TCMALTUNKAN - MEHMET ANIL ALTUNKAN
 * @Date: 30.12.2019:09:51, Pzt
 **/
@Data @AllArgsConstructor
public class LoginResponse {
    private SuccessFailure status;
    private String message;

    public enum SuccessFailure {
        SUCCESS, FAILURE
    }
}
