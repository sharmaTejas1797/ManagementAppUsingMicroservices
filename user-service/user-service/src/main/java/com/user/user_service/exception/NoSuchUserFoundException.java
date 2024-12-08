package com.user.user_service.exception;

public class NoSuchUserFoundException extends RuntimeException{


    public NoSuchUserFoundException(String message) {
        super(message);

    }

    public NoSuchUserFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
