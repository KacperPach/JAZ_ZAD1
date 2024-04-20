package com.JAZ1.zad1;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PotionsService {

    private final PotionsRepository repository;

    public PotionsResponse addPotion(PotionsCreateRequest request) {
        Potion newPotion = new Potion();
        newPotion.setName(request.getName());
        newPotion.setDescription(request.getDescription());
        newPotion.setPrice(request.getPrice());

        Potion saved = repository.save(newPotion);

        return new PotionsResponse(saved.getId(), saved.getName());
    }

    public List<PotionsResponse> getAllPotions () {
        return repository.findAll().stream().map( p -> new PotionsResponse(p.getId(),p.getName())).toList();
    }

    public PotionsResponse getPotion(UUID id) {
        Potion saved = repository.getReferenceById(id);

        return new PotionsResponse(saved.getId(),saved.getName());
    }

    public PotionsResponse updatePotion(UUID id, PotionsCreateRequest req) {
        Potion potion = repository.getReferenceById(id);
        potion.setName(req.getName());
        potion.setPrice(req.getPrice());
        potion.setDescription(req.getDescription());
        repository.save(potion);

        return new PotionsResponse(potion.getId(),potion.getName());
    }

    public void deletePotion(UUID id) {
        repository.deleteById(id);
    }


}
