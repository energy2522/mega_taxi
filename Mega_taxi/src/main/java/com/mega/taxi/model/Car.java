package com.mega.taxi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private int id;
    private int idDriver;
    private String mark;
    private String model;
    private String number;
    private String status;
}
