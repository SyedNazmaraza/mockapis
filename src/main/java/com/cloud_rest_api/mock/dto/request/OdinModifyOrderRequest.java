package com.cloud_rest_api.mock.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OdinModifyOrderRequest {
    @JsonProperty("order_type")
    private String orderType;
    @JsonProperty("quantity")
    private int quantity;
    @JsonProperty("traded_quantity")
    private int tradedQuantity;
    @JsonProperty("price")
    private double price;
    @JsonProperty("trigger_price")
    private double triggerPrice;
    @JsonProperty("disclosed_quantity")
    private int disclosedQuantity;
    @JsonProperty("validity")
    private String validity;
    @JsonProperty("validity_days")
    private int validityDays;
}
