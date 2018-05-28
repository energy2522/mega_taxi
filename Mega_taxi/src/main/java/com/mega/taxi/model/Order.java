package com.mega.taxi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private int id;
    private int idClient;
    private int idDispatcher;
    private int idCar;
    private int idRoute;
    private int sum;
    private Date orderDate;
}
