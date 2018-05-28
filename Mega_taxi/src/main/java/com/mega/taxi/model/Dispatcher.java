package com.mega.taxi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dispatcher {
    private int id;
    private String name;
    private String surname;
    private Date dateOfBirth;
}
