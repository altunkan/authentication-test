package com.anilaltunkan.security.service;

import com.anilaltunkan.security.dto.LoginRequest;
import com.anilaltunkan.security.dto.LoginResponse;
import com.anilaltunkan.security.dto.UserSummary;
import org.springframework.http.ResponseEntity;

/**
 * @Author: TCMALTUNKAN - MEHMET ANIL ALTUNKAN
 * @Date: 30.12.2019:09:54, Pzt
 **/
public interface UserService {
    ResponseEntity<LoginResponse> login(LoginRequest loginRequest, String accessToken, String refreshToken);

    ResponseEntity<LoginResponse> refresh(String accessToken, String refreshToken);

    UserSummary getUserProfile();
}
