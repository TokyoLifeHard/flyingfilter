package com.gridnine.testing;

public class NoFlightsException extends RuntimeException{

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public NoFlightsException(String message) {
        super(message);
    }
}
