package com.example.daomapper.models;

import lombok.*;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User {
    private Long id;
    private String username;
    private String password;
    private Passport passport;
}
