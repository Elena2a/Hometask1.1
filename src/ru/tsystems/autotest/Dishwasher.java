package ru.tsystems.autotest;

import static ru.tsystems.autotest.Status.*;

public class Dishwasher {

    private int contents;
    private Status status;
    private String[] capacity;
    int dishesCount;

    Dishwasher(int contents) {
        if (contents > 0) {
            System.out.println("The dishwasher is loaded");
        } else if (contents < 0) {
            throw new RuntimeException("Can't start");
        }
        this.contents = contents;
        this.status = status;
    }

    /**
     * This method performs add dishes
     *
     * @throws ProgramStartedException       if the dishwasher is started
     * @throws OverloadedDishwasherException if the dishwasher is overloaded
     */
    public void addDish(String dish) {
        if (status == START) {
            throw new ProgramStartedException("Can't add dish during cycle");
        } else if (dishesCount < capacity.length) {
            capacity[dishesCount] = dish;
            dishesCount++;
        } else if (dishesCount > capacity.length) {
            throw new OverloadedDishwasherException("The dishwasher is overloaded");
        } else {
            System.out.println("The dishes were added");
        }
    }

    /**
     * This method performs start
     *
     * @throws EmptyDishwasherException if Contents is less than 0
     */
    public void start() {
        if (contents <= 0) {
            throw new EmptyDishwasherException("Can't start, add some dishes");
        } else {
            for ( int contents = 0; contents <= 10; contents++ ) {
                System.out.println("You can start");
            }
        }
    }

    /**
     * This method performs getting dishes
     *
     * @throws ProgramStartedException if the dishwasher is started
     */
    public void getContents() {
        if (status == START) {
            throw new ProgramStartedException("Stop the dishwasher");
        } else {
            System.out.println("Please take dishes");
        }
    }

    /**
     * This method performs stop
     *
     * @throws ProgramStoppedException if the dishwasher is stopped
     */
    public void stop() {
        if (status == STOP) {
            throw new ProgramStoppedException("The dishwasher is stopped");
        } else {
            status = STOP;
        }
    }

    public void status() {
        if (status == Status.START) {
            System.out.println("The dishwasher is started");
        } else if (status == Status.STOP) {
            System.out.println("The dishwasher is stopped.");
        }
    }
}







