package com.adroitfirm.rydo.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RideDto {
    private Long id;

    private Long customerId;

    private Long driverId;

    @Size(max = 255)
    private String pickupLocation;

    @Size(max = 255)
    private String dropLocation;

    private Double pickupLat;
    private Double pickupLng;
    private Double dropLat;
    private Double dropLng;

    private BigDecimal fareEstimated;
    private BigDecimal fareFinal;
    private BigDecimal distanceKm;
    private Integer durationMinutes;

    @Size(max = 20)
    private String status;

    private LocalDateTime requestedAt;
    private LocalDateTime startedAt;
    private LocalDateTime completedAt;
    
    private String cancelledReason;
    private String denialReason;
}