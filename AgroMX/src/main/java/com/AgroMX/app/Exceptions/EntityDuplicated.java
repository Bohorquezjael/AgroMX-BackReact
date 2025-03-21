package com.AgroMX.app.Exceptions;

public class EntityDuplicated extends RuntimeException{
    
    public EntityDuplicated(){
        super("Entity already exists");
    }

    public EntityDuplicated(Long id){
        super("Entity already exists with id: " + id);
    }

    public EntityDuplicated(String name){
        super("Entity already exists with name: " + name);
    }

    public EntityDuplicated(String message, Throwable cause){
        super(message, cause);
    }
}
