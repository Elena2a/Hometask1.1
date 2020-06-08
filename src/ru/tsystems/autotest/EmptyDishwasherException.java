package ru.tsystems.autotest;

public class EmptyDishwasherException extends RuntimeException {

    public EmptyDishwasherException(String description) {
        super(description);
    }
}