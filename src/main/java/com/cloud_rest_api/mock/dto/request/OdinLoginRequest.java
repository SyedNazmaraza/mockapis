package com.cloud_rest_api.mock.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OdinLoginRequest {
    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("login_type")
    private String loginType;
    @JsonProperty("password")
    private String password;
    @JsonProperty("second_auth_type")
    private String secondAuthType;
    @JsonProperty("second_auth")
    private String secondAuth;
    @JsonProperty("api_key")
    private String apiKey;
    @JsonProperty("source")
    private String source;
    @JsonProperty("UDID")
    private String udid;
    @JsonProperty("version")
    private String version;
    @JsonProperty("iosversion")
    private String iosVersion;
    @JsonProperty("build_version")
    private String buildVersion;

}
