package com.JAZ1.zad1;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class PotionsController {
    private final PotionsService service;

    @PostMapping("/addPotion")
    public PotionsResponse createPotion(@RequestBody PotionsCreateRequest req) {
        return service.addPotion(req);
    }

    @GetMapping("/getPotions")
    public List<PotionsResponse> getPotions() {
        return service.getAllPotions();
    }

    @GetMapping("/getPotion/{id}")
    public PotionsResponse getPotion(@PathVariable UUID id) {
        return service.getPotion(id);
    }

    @PutMapping("/updatePotion/{id}")
    public PotionsResponse updatePotion(@PathVariable UUID id, @RequestBody PotionsCreateRequest req) {
        return service.updatePotion(id, req);
    }

    @DeleteMapping("/deletePotion/{id}")
    public void deletePotion(@PathVariable UUID id) {
        service.deletePotion(id);
    }
}
