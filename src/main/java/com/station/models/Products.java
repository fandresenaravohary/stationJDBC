package com.station.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Products {
    private String name;
    private double unitPrice;
    private double evaporationRate;
}
