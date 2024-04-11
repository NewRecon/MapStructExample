package com.example.daomapper.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddressDto {
    private Long id;
    private String country;
    private String city;
    private String street;
    private String numberOfHouse;
}
