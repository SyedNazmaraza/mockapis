package com.cloud_rest_api.mock.controller;

import com.cloud_rest_api.mock.dto.request.OdinModifyOrderRequest;
import com.cloud_rest_api.mock.dto.request.OdinPlaceBracketOrderRequest;
import com.cloud_rest_api.mock.dto.request.OdinPlaceOrderRequest;
import com.cloud_rest_api.mock.dto.response.OdinBaseResponse;
import com.cloud_rest_api.mock.dto.response.OdinCancelOrderResponse;
import com.cloud_rest_api.mock.dto.response.OdinModifyOrderResponse;
import com.cloud_rest_api.mock.dto.response.OdinPlaceOrderResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transactional/v1/orders")
public class OrderController {

    @PostMapping("/regular")
    public ResponseEntity<OdinBaseResponse> placeOrder(@RequestBody OdinPlaceOrderRequest request) {
        return new ResponseEntity<>(OdinBaseResponse.builder()
                .status("success")
                .code("s-101")
                .message("Order Entry Sent to OMS")
                .data(OdinPlaceOrderResponse.builder().orderId("NWSYF00005>3").build())
                .build(), HttpStatus.OK);
    }

    @DeleteMapping("/regular/{exchange}/{order_id}")
    public ResponseEntity<OdinBaseResponse> cancelOrder(@PathVariable String exchange, @PathVariable String order_id) {
        return new ResponseEntity<>(OdinBaseResponse.builder()
                .status("success")
                .code("s-101")
                .message("Order Cancellation Sent to OMS")
                .data(OdinCancelOrderResponse.builder().orderId("NWSYF00005>3").build())
                .build(), HttpStatus.OK);
    }

    @PutMapping("/regular/{exchange}/{order_id}")
    public ResponseEntity<OdinBaseResponse> modifyOrder(@RequestBody OdinModifyOrderRequest request, @PathVariable String exchange, @PathVariable String order_id) {
        return new ResponseEntity<>(OdinBaseResponse.builder()
                .status("success")
                .code("s-101")
                .message("Order Modification Sent to OMS")
                .data(OdinModifyOrderResponse.builder().orderId("NWSYF00005>3").build())
                .build(), HttpStatus.OK);
    }

    @PostMapping("/bracket")
    public ResponseEntity<OdinBaseResponse> placeBracketOrder(@RequestBody OdinPlaceBracketOrderRequest request) {
        return new ResponseEntity<>(OdinBaseResponse.builder()
                .status("success")
                .code("s-101")
                .message("Order Entry Sent to OMS")
                .data(OdinPlaceBracketOrderResponse.builder().orderId("NWSYF00005>3").build())
                .build(), HttpStatus.OK);
    }
}
