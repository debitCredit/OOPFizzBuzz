package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner reader = new Scanner(System.in);

        System.out.println("FizzBuzz test");

        System.out.println("Enter lower bound: ");
        int from = reader.nextInt();

        System.out.println("Enter upper bound: ");
        int to = reader.nextInt();


        ConsoleBasedFizzBuzz cbf  = new ConsoleBasedFizzBuzz(from, to);
        cbf.print(from, to);

    }
}
