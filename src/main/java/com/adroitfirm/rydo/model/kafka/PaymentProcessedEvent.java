package com.adroitfirm.rydo.model.kafka;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentProcessedEvent {

	private String paymentId;
    private String rideId;
    private String userId;
    private double amount;
    private String status; // SUCCESS, FAILED, PENDING
    private Instant processedAt;
}
