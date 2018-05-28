package com.mega.taxi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private int id;
    private String country;
    private String region;
    private String district;
    private String city;
    private String street;
    private int number;
}
