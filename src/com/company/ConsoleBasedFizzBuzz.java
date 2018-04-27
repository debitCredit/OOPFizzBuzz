package com.company;

public class ConsoleBasedFizzBuzz implements FizzBuzz {

    private int from;
    private int to;

    public ConsoleBasedFizzBuzz(int from, int to) {
        this.from = from;
        this.to = to;
    }


    @Override
    public void print(int from, int to) {

        for (int i = from; i <= to; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else System.out.println(i);
        }
    }
}
