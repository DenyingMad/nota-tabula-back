package com.devilpanda.auth_service.app.api;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface JwtService {
    String getJwtToken(HttpServletRequest request);

    String generateToken(Authentication login);

    String getUserNameFromToken(String token);

    boolean validateToken(String token);
}
