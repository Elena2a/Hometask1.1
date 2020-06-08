package ru.tsystems.autotest;

public class ProgramStartedException extends RuntimeException {

    public ProgramStartedException(String description) {
        super(description);
    }
}
