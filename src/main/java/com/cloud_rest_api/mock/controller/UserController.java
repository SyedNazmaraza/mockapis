package com.cloud_rest_api.mock.controller;


import com.cloud_rest_api.mock.dto.request.OdinLoginRequest;
import com.cloud_rest_api.mock.dto.response.OdinBaseResponse;
import com.cloud_rest_api.mock.dto.response.OdinLoginResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/authentication/v1/user/session")
public class UserController {

    @PostMapping
    public ResponseEntity<OdinBaseResponse> login(@RequestBody OdinLoginRequest request) {
        return new ResponseEntity<>(
                OdinBaseResponse.builder()
                        .status("success")
                        .code("s-101")
                        .message("User logged in Successfully.")
                        .data(OdinLoginResponse.builder()
                                .registerToken("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJDdXN0b21lcklkIjoiMTQwNCIsInVzZXJJZCI6IkFQSVRFU1QiLCJncm91cElkIjoiSE8iLCJ1ZGlkIjoiYTFiMjNjZDRlNWY2Zzc4aCIsInNvdXJjZSI6Ik1PQklMRUFQSSIsIm9jVG9rZW4iOiIweDAxNDUzOTg0RDlCMzdEQTAyNzVGRDhCOERGM0ZCMiIsImV4cCI6MTY2MzY4NjAyMSwiaWF0IjoxNjYzNjg1MTIxfQ.kNSl7ZNuNetTg0qhcnk24jMGm193P_M8WQtE4kOPnDQ")
                                .ptnType("TOTP_OPT")
                                .mpinEnabled(true)
                                .fingerprintEnabled(true)
                                .totpEnabled(false)
                                .build()
                        )
                        .build(),
                HttpStatus.OK
        );
    }

}
