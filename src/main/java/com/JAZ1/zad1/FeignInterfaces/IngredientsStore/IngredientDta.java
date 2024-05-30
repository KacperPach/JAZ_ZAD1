package com.JAZ1.zad1.FeignInterfaces.IngredientsStore;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.UUID;

@Data
public class IngredientDta {
    UUID id;
    String name;
}
