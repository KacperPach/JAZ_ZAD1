package com.JAZ1.zad1.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such Potion")
public class PotionNotFoundException extends RuntimeException{
    public PotionNotFoundException() {
    }

    public PotionNotFoundException(String message) {
        super(message);
    }
}
