package com.JAZ1.zad1;

import com.baeldung.openapi.api.PotionsApi;
import com.baeldung.openapi.model.PotionsCreateRequest;
import com.baeldung.openapi.model.PotionsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class PotionsController implements PotionsApi {
    private final PotionsService service;

    @PostMapping("/addPotion")
    public  ResponseEntity<PotionsResponse> createPotion(PotionsCreateRequest potionsCreateRequest)  {
        return ResponseEntity.ok(service.addPotion(potionsCreateRequest));
    }

    @GetMapping("/getPotions")
    public ResponseEntity<List<PotionsResponse>> getPotions(){
        return ResponseEntity.ok(service.getAllPotions());
    }

    @GetMapping("/getPotion/{id}")
    public ResponseEntity<PotionsResponse> getPotion(@PathVariable UUID id) {
        return ResponseEntity.ok(service.getPotion(id));
    }

    @PutMapping("/updatePotion/{id}")
    public ResponseEntity<PotionsResponse> updatePotion(@PathVariable UUID id, @RequestBody PotionsCreateRequest potionsCreateRequest) {
        return ResponseEntity.ok(service.updatePotion(id, potionsCreateRequest));
    }

    @DeleteMapping("/deletePotion/{id}")
    public ResponseEntity<Void> deletePotion(@PathVariable UUID id) {
        service.deletePotion(id);
        return ResponseEntity.ok().build();
    }
}
