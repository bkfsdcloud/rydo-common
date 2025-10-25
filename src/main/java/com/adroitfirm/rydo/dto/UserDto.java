package com.adroitfirm.rydo.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private Long id;

    @NotBlank(message = "Username should not be blank")
    @Size(max = 100)
    private String name;

    @Email
    @Size(max = 100)
    private String email;

    @Size(max = 15)
    private String phone;

    @Size(max = 255)
    private String password;

    @Default
    @NotBlank
    @Size(max = 20)
    private String role = "CUSTOMER";

    @Size(max = 255)
    private String profileImageUrl;

    @Default
    private Boolean isActive = true;

    @Size(max = 100)
    private String deviceId;
    
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}