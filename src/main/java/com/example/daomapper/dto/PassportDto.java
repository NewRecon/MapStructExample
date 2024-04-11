package com.example.daomapper.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PassportDto {
    private Long id;
    private String firstName;
    private String lastName;

    private AddressDto registerAddress;
    private AddressDto birthAddress;
}
