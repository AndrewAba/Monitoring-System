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
public class ComputedValues {
    private double co2_min;
    private double co2_max;
    private double co2_default;
    private double humidity_min;
    private double humidity_max;
    private double humidity_default;
    private double temperature_min;
    private double temperature_max;
    private double temperature_default;
}
