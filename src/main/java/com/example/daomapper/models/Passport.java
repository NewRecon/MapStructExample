package com.example.daomapper.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Passport {
    private Long id;
    private String firstName;
    private String lastName;
    private Address registerAddress;
    private Address birthAddress;
}
