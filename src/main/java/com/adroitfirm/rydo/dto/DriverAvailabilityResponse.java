package com.adroitfirm.rydo.dto;

import com.adroitfirm.rydo.model.Coordinate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DriverAvailabilityResponse {
	Coordinate coordinate;
	private double radiusKm;
	private String driverId;
}
