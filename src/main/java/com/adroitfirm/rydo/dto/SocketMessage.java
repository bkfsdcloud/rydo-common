package com.adroitfirm.rydo.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.adroitfirm.rydo.model.Coordinate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SocketMessage implements Serializable {

	private static final long serialVersionUID = 2501854264663285378L;
	private String message;
	private Coordinate pickup;
	private Coordinate drop;
	private Coordinate driverLocation;
	private BigDecimal fare;
	private BigDecimal distance;
	private String driverStatus;
	private String rideStatus;
}
