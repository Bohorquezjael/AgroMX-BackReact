package com.AgroMX.app.Exceptions;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(Long id) {
        super("Entity not found with id: " + id);
    }

    public EntityNotFoundException() {
        super("Entity not found");
    }
    
    public EntityNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
