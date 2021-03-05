package com.techelevator;

public class AdditionalExamples {

    public static void main (String [] args) {

        // if else if example
        int age = 40;
        if (age <= 18) {
            System.out.println("Minor");
        } else if (age > 18 && age < 60) {
            System.out.println("Adult");
        } else {
            System.out.println("Retiree");
        }

        // loop, print all the numbers from 1 to 10.
        for (int i=0; i < 10; i++) {
            System.out.println(i+1);
        }
        System.out.println("******");
        // loop, the numbers from 1 to 10 only if it's even.
        for (int i =1; i<= 10; i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}
