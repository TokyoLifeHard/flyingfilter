package com.gridnine.testing;

public class NoSuchFilteringResultException extends RuntimeException {

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public NoSuchFilteringResultException(String message) {
        super(message);
    }
}
