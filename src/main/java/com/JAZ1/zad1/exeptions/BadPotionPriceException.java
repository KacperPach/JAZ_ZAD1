package com.JAZ1.zad1.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Wrong Potion price")
public class BadPotionPriceException extends BadPotionFieldsException{
    public BadPotionPriceException() {
    }

    public BadPotionPriceException(String message) {
        super(message);
    }
}
