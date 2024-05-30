package com.JAZ1.zad1.FeignInterfaces.IngredientsStore;

import com.baeldung.openapi.model.IngredientResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.UUID;

@FeignClient(value = "ingredients", url = "localhost:8081")
public interface IngredientsClient {

    @GetMapping("/ingredients/{id}")
    ResponseEntity<IngredientResponse> getIngredient(@PathVariable("id") UUID ingredientId);
}
