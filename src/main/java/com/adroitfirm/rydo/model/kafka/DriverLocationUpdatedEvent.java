package com.adroitfirm.rydo.model.kafka;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverLocationUpdatedEvent {
	private String driverId;
    private double latitude;
    private double longitude;
    private Instant updatedAt;
}
