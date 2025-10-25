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
public class RideRequested {

	private Long rideId;
    private Long userId;
    private Long driverId;
    private String status; // CREATED, ACCEPTED, COMPLETED
    private Instant createdAt;
}
