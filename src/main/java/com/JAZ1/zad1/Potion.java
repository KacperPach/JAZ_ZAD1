package com.JAZ1.zad1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Data
@Entity
public class Potion {
    @Id
    @UuidGenerator
    private UUID id;
    private String name;
    private String description;
    private Double price;
}
