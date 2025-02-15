package com.cloud_rest_api.mock.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class OdinCancelOrderResponse {
    private String orderId;
}
