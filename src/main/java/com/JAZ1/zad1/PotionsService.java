package com.JAZ1.zad1;

import com.JAZ1.zad1.exeptions.BadPotionFieldsException;
import com.JAZ1.zad1.exeptions.BadPotionPriceException;
import com.JAZ1.zad1.exeptions.PotionNotFoundException;
import com.JAZ1.zad1.model.Potion;
import com.baeldung.openapi.model.PotionsCreateRequest;
import com.baeldung.openapi.model.PotionsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PotionsService {

    private final PotionsRepository repository;
    private final PotionsMapper mapper;

    public PotionsResponse addPotion(PotionsCreateRequest request) {

        verifyPotionFields(request);
        Potion saved = repository.save(mapper.mapToPotion(request));

        return mapper.mapToPotionsResponse(saved);
    }

    public List<PotionsResponse> getAllPotions () {
        return repository.findAll().stream().map(mapper::mapToPotionsResponse).collect(Collectors.toList());
    }

    public PotionsResponse getPotion(UUID id) {
        if (!repository.existsById(id))
            throw new PotionNotFoundException("no potion under the id: " + id);
        return mapper.mapToPotionsResponse(repository.getReferenceById(id));
    }

    public PotionsResponse updatePotion(UUID id, PotionsCreateRequest req) {
        if (!repository.existsById(id))
            throw new PotionNotFoundException("no potion under the id: " + id);
        verifyPotionFields(req);
        Potion potion = repository.getReferenceById(id);
        potion.setName(req.getName());
        potion.setPrice(req.getPrice());
        potion.setDescription(req.getDescription());
        repository.save(potion);

        return mapper.mapToPotionsResponse(potion);
    }

    public void deletePotion(UUID id) {
        if (!repository.existsById(id))
            throw new PotionNotFoundException("no potion under the id: " + id);
        repository.deleteById(id);
    }

    private void verifyPotionFields(PotionsCreateRequest req) {
        if (req.getPrice() < 0.0)
            throw new BadPotionPriceException();
        if (req.getDescription().isEmpty())
            throw new BadPotionFieldsException();
        if (req.getName().isEmpty())
            throw new BadPotionFieldsException();
    }


}
