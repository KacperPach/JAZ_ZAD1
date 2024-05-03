package com.JAZ1.zad1;

import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface PotionsMapper {

    Potion mapToPotion(PotionsCreateRequest potionsCreateRequest);

    PotionsResponse mapToPotionsResponse(Potion potion);
}
