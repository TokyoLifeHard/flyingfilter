package com.gridnine.testing;

public class NoFilteringResultException extends RuntimeException {

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public NoFilteringResultException(String message) {
        super(message);
    }
}
