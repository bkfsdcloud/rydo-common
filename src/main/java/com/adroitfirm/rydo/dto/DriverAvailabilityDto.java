package com.adroitfirm.rydo.dto;

import com.adroitfirm.rydo.model.Coordinate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DriverAvailabilityDto {
	Coordinate coordinate;
	private double radiusKm;
	@Default
	private int countLimit = 10;
}
