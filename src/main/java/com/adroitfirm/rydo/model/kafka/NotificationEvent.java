package com.adroitfirm.rydo.model.kafka;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationEvent {

	private String notificationId;
    private String userId;
    private String message;
    private String type; // RIDE_CONFIRMED, PAYMENT_SUCCESS, etc.
    private Instant sentAt;
}
