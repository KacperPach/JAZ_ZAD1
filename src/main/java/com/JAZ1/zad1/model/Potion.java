package com.JAZ1.zad1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
    private UUID ingredientId;
}
