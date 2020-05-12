package com.example.monitoringsystem.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Parameters {
    private double co2;
    private double humidity;
    private double temperature; // TODO ask database
    private Date date;
}
