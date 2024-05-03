package com.JAZ1.zad1;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR,
        componentModel = "spring",
        builder = @Builder(disableBuilder = true),
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface PotionsMapper {

    Potion mapToPotion(PotionsCreateRequest potionsCreateRequest);


    PotionsResponse mapToPotionsResponse(Potion potion);
}
