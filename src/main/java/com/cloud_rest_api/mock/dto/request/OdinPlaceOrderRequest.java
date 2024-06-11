package com.cloud_rest_api.mock.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OdinPlaceOrderRequest {
    @JsonProperty("scrip_info")
    private ScripInfo scripInfo;
    @JsonProperty("transaction_type")
    private String transactionType;
    @JsonProperty("product_type")
    private String productType;
    @JsonProperty("order_type")
    private String orderType;
    @JsonProperty("quantity")
    private int quantity;
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
    @JsonProperty("is_amo")
    private boolean isAmo;
    @JsonProperty("order_identifier")
    private String orderIdentifier;
    @JsonProperty("part_code")
    private String partCode;
    @JsonProperty("algo_id")
    private String algoId;
    @JsonProperty("strategy_id")
    private String strategyId;
    @JsonProperty("vender_code")
    private String venderCode;
}
