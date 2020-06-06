package ru.tsystems.autotest;

import static ru.tsystems.autotest.Display.*;

public class Dishwasher<contents> {

    private int contents;
    private Display status;

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
     * @throws MyException if the dishwasher is started or overloaded
     */

    public void addDish() {
        if (status == START) {
            throw new MyException("Can't add dish during cycle");

        } else if (contents > 10) {
            throw new MyException("The dishwasher is overloaded");
        }else {
            System.out.println("The dishes were added");
        }


    }

    /**
     * This method performs start
     *
     * @throws MyException2 if Contents is less than 0
     */


    public void start() {
        if (contents <= 0) {

            throw new MyException2("Can't start, add some dishes");

        } else {
            for ( int contents = 0; contents <= 10; contents++){
                System.out.println("You can start");

            }
        }
    }

    /**
     * This method performs getting dishes
     *
     * @throws MyException if the dishwasher is started
     */



    public void getContents() {
        if (status == START) {
            throw new MyException("Stop the dishwasher");

        } else {
            System.out.println("Please take dishes");
        }

    }

    /**
     * This method performs stop
     *
     * @throws MyException3 if the dishwasher is stopped
     */
    public void stop() {

        if (status == STOP) {
            throw new MyException3("The dishwasher is stopped");
        } else {
            status = STOP;
        }


    }

    public void status() {
        System.out.println(status);
    }
}






