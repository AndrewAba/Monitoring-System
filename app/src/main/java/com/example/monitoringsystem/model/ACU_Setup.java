package com.example.monitoringsystem.model;

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
public class ACU_Setup {
    private String name;
    private double co2;
    private double humidity;
    private double temperature;
}
