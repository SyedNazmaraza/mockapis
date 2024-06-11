package com.cloud_rest_api.mock.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OdinPlaceBracketOrderRequest {
    @JsonProperty("scrip_info")
    private ScripInfo scripInfo;
    @JsonProperty("transaction_type")
    private String transactionType;
    @JsonProperty("main_leg")
    private MainLeg mainLeg;
    @JsonProperty("stoploss_leg")
    private StoplossLeg stoplossLeg;
    @JsonProperty("profit_leg")
    private ProfitLeg profitLeg;
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

    @Getter
    @Setter
    static
    class MainLeg {
        @JsonProperty("order_type")
        private String orderType;
        @JsonProperty("quantity")
        private int quantity;
        @JsonProperty("price")
        private String price;
        @JsonProperty("trigger_price")
        private int triggerPrice;
        @JsonProperty("traded_quantity")
        private int tradedQuantity;
    }

    @Getter
    @Setter
    static
    class StoplossLeg {
        @JsonProperty("legs")
        private List<Legs> legs;
        @JsonProperty("trail")
        private Trail trail;
    }

    @Getter
    @Setter
    static
    class Legs {
        @JsonProperty("quantity")
        private int quantity;
        @JsonProperty("price")
        private int price;
        @JsonProperty("trigger_price")
        private int triggerPrice;
    }

    @Getter
    @Setter
    static
    class Trail {
        @JsonProperty("ltp_jump_price")
        private double ltpJumpPrice;
        @JsonProperty("stoploss_jump_price")
        private double stoplossJumpPrice;
    }

    @Getter
    @Setter
    static
    class ProfitLeg {
        @JsonProperty("legs")
        private List<Legs> legs;
    }
}
