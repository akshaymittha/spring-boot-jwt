package com.example.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class JwtRequest {
    private String email;
    private String password;
}
