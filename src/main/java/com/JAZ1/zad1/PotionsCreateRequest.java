package com.JAZ1.zad1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class PotionsCreateRequest {
    private String name;
    private String description;
    private Double price;
}
