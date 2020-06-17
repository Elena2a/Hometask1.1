package ru.tsystems.autotest;

public class Main {

    public static void main(String[] args) {

        Dishwasher dishy = new Dishwasher(10);
        dishy.start();
        dishy.addDish("plate");
        dishy.addDish("fork");
        dishy.addDish("spoon");
        dishy.getContents();
        dishy.addDish("bowl");
        dishy.stop();
        dishy.status();
        dishy.addDish("bowl");
        dishy.addDish("bowl");

    }
}




