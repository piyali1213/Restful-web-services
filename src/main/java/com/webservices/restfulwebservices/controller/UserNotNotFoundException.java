package com.webservices.restfulwebservices.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class UserNotNotFoundException extends RuntimeException {
    public UserNotNotFoundException(String message) {
        super(message);
    }
}
