package org.example.onlinemoviebookinglocationms.exception;

public class DuplicateLocationFound extends RuntimeException {
    public DuplicateLocationFound(int id) {
        super("Duplicate location found for id: " + id);
    }

}