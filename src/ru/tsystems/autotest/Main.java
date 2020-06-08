package ru.tsystems.autotest;

public class Main {

    public static void main(String[] args) {

        Dishwasher dishy = new Dishwasher(10);
        dishy.start();
        dishy.addDish();
        dishy.addDish();
        dishy.getContents();
        dishy.start();
        dishy.addDish();
        dishy.stop();
        dishy.status();
        dishy.addDish();

    }
}



