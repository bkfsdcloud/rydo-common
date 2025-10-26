package com.adroitfirm.rydo.model.kafka;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RideEvent {

	private Long rideId;
    private Long userId;
    private Long driverId;
    private Long rideAssignmentId;
    private String status;
    private Instant createdAt;
    private String cancelledReason;
    private String denialReason;    
}
