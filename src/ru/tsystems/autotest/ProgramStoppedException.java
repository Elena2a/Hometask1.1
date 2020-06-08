package ru.tsystems.autotest;

public class ProgramStoppedException extends RuntimeException {

    public ProgramStoppedException(String description) {
        super(description);
    }
}



