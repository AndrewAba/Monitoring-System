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
public class ACU {
    private ACU_Setup acu_setup;
    private DefaultValue defaultValue;
}
