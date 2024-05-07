package com.station.models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Station {
    private String name;
    private String location;
    private List<Stocks> stocks;
}
