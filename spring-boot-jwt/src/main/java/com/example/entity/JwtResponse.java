package com.example.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class JwtResponse {
    private String jwtToken;
    private String userName;
}
