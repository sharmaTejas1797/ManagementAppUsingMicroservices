package com.user.user_service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserExceptionHandler {
    @ExceptionHandler(value = {NoSuchUserFoundException.class})
    public ResponseEntity<Object> handleNoSuchUserFoundException
            (NoSuchUserFoundException noSuchUserFoundException){

        UserException userException = new UserException(
                noSuchUserFoundException.getMessage(),
                noSuchUserFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(userException,HttpStatus.NOT_FOUND);

    }
}
