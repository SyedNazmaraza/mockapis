package com.cloud_rest_api.mock.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScripInfo {
    @JsonProperty("exchange")
    private String exchange;
    @JsonProperty("scrip_token")
    private int scripToken;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("series")
    private String series;
    @JsonProperty("expiry_date")
    private String expiryDate;
    @JsonProperty("strike_price")
    private String strikePrice;
    @JsonProperty("option_type")
    private String optionType;
}