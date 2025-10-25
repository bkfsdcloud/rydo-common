package com.adroitfirm.rydo.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.*;
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
public class DriverDocumentDto {
    private Long id;

    @NotNull
    private Long driverId;

    @Size(max = 50)
    private String documentType;

    @Size(max = 50)
    private String documentNumber;

    @Size(max = 255)
    private String documentUrl;

    private LocalDate expiryDate;

    private Boolean verified;
    private java.time.LocalDateTime uploadedAt;
}