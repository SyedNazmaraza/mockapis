package com.cloud_rest_api.mock.dto.response;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
@Getter
@Setter
@Builder
@JsonPropertyOrder({"status", "code", "message","data"})
public class OdinBaseResponse {
    private String status;
    private String code;
    private String message;
    private Object data;
}