package com.odeyalo.support.clients.auth;

import com.odeyalo.support.clients.auth.dto.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.odeyalo.support.clients.auth.dto.RefreshTokenResponseDTO;

@FeignClient(name = "auth-microservice", url = "${app.clients.auth.urls.domain}")
public interface AuthMicroserviceClient {

    @PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> registerUser(@RequestBody RegisterUserDTO userDTO);

    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<JwtTokenResponseDTO> loginUser(@RequestBody LoginUserDTO userDto);

    @PostMapping(value = "/refreshToken", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<RefreshTokenResponseDTO> getJwtTokenUsingRefreshToken(@RequestBody RefreshTokenRequest tokenRequest);

    @GetMapping(value = "/verify/code", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<JwtTokenResponseDTO> verifyCode(@RequestParam String code);

    @PostMapping(value = "/password/recovery/phone/number", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> sendPhoneNumberMethodPasswordRecoveryPasswordCode(@RequestBody PhoneNumberMethodPasswordRecoveryDTO dto);

    @PostMapping(value = "/password/recovery/phone/number/code", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> resetPasswordUsingPhoneNumberCode(@RequestParam String code, @RequestBody NewPasswordDTO dto);

    @PostMapping(value = "/password/recovery/email")
    ResponseEntity<?> sendEmailRecoveryPasswordCode(@RequestBody EmailMethodPasswordRecoveryDTO dto);

    @PostMapping("/password/recovery/email/code")
    ResponseEntity<?> resetPasswordUsingEmailCode(@RequestParam String code, @RequestBody NewPasswordDTO dto);
}
