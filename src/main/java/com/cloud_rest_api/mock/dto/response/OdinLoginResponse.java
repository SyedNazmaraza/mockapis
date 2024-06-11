package com.cloud_rest_api.mock.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@JsonPropertyOrder({"register_token", "ptn_type", "mpin_enabled", "fingerprint_enabled", "totp_enabled"})
public class OdinLoginResponse {
    @JsonProperty("register_token")
    private String registerToken;
    private String ptnType;
    @JsonProperty("mpin_enabled")
    private Boolean mpinEnabled;
    @JsonProperty("fingerprint_enabled")
    private Boolean fingerprintEnabled;
    @JsonProperty("totp_enabled")
    private Boolean totpEnabled;
}
