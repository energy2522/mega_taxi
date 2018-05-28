package com.mega.taxi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Route {
    private int id;
    private float tariff;
    private int idStartAddress;
    private int idEndAddress;
}
