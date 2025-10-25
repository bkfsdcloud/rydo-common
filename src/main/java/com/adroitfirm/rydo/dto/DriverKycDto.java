package com.adroitfirm.rydo.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
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
public class DriverKycDto {
    private Long id;

    @NotNull
    private Long driverId;

    @Size(max = 20)
    private String kycStatus;

    private Long verifiedBy;

    private LocalDateTime verifiedAt;

    private String remarks;
    
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}