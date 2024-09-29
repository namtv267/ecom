package com.auth.domain.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    @NotNull
    private String firstName;

    private String lastName;
    private String fullName;
    private String email;
    private String username;
    private String password;
    private String token;
    private String refreshToken;
}
