package com.JAZ1.zad1;

import com.JAZ1.zad1.model.Potion;
import com.baeldung.openapi.model.PotionsCreateRequest;
import com.baeldung.openapi.model.PotionsResponse;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface PotionsMapper {

    Potion mapToPotion(PotionsCreateRequest potionsCreateRequest);

    PotionsResponse mapToPotionsResponse(Potion potion);
}
