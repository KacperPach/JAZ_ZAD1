package com.JAZ1.zad1;

import com.JAZ1.zad1.model.Potion;
import com.baeldung.openapi.model.PotionsCreateRequest;
import com.baeldung.openapi.model.PotionsResponse;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface PotionsMapper {
    //=@Mapping(target = "ingredientId", source = "potionsCreateRequest.id")
    Potion mapToPotion(PotionsCreateRequest potionsCreateRequest);

   // @Mapping(target = "ingredientId", source = "potion.id")
    PotionsResponse mapToPotionsResponse(Potion potion);
}
