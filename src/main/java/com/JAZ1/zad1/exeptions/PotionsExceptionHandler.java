package com.JAZ1.zad1.exeptions;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class PotionsExceptionHandler {

    Logger logger = LogManager.getLogger(PotionsExceptionHandler.class);

    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Potion not found")
    @ExceptionHandler(PotionNotFoundException.class)
    public void potionNotFound(HttpServletRequest req, Exception ex) {
        logger.warn("Potion not found at: {} raised {}", req.getRequestURL(), ex.getMessage());
    }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Wrong Potion Price")
    @ExceptionHandler(BadPotionPriceException.class)
    public void potionBadPrice(HttpServletRequest req, Exception ex) {
        logger.warn("Bad Potion price at: {} ", req.getRequestURL());
    }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Wrong Potion fields")
    @ExceptionHandler(BadPotionFieldsException.class)
    public void potionBadFields(HttpServletRequest req, Exception ex) {
        logger.warn("Wrong potion add request at: {} ", req.getRequestURL());
    }

}
