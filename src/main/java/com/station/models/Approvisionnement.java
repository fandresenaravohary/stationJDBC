package com.station.models;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Approvisionnement {
    private Date date;
    private int gasolineQuantity;
    private int dieselQuantity;
    private int PetrolQuantity;
    private Station station;
}
