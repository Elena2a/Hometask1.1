package ru.tsystems.autotest;

import static ru.tsystems.autotest.Status.*;

public class Dishwasher {

    private int contents;
    private Status status;

    Dishwasher(int contents) {
        if (contents > 0) {

        } else if (contents < 0) {
            throw new RuntimeException("Can't start");
        }
        this.contents = contents;
        this.status = status;


    }


    /**
     * This method performs add dishes
     *
     * @throws ProgramStartedException if the dishwasher is started or overloaded
     */

    public void addDish() {
        if (status == START) {
            throw new ProgramStartedException("Can't add dish during cycle");

        } else if (contents > 10) {
            throw new ProgramStartedException("The dishwasher is overloaded");
        }else {
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
            for ( int contents = 0; contents <= 10; contents++){
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
        System.out.println(status);
    }
}






