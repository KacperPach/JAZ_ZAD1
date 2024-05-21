package com.JAZ1.zad1.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Wrong Potion fields")
public class BadPotionFieldsException extends RuntimeException{
    public BadPotionFieldsException() {
    }

    public BadPotionFieldsException(String message) {
        super(message);
    }
}
