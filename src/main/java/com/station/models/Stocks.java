package com.station.models;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Stocks {
    private Products produit;
    private int quantity;
    private Date lastUpdate;
}
