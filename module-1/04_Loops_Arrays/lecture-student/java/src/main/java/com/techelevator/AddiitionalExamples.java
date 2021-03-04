package com.techelevator;

public class AddiitionalExamples {
    public static void main (String [] args) {
        int age = 40;
        if ( age <= 15) {
            System.out.println("Minor");
        } else if (age > 18 && age < 60){
            System.out.println("Adult");
        } else {
            System.out.println("Retiree");
        }

        for (int i=0; i < 10; i++){
            System.out.println(i+1);
        }
        System.out.println("*******");
        for (int i = 1; i <= 10; i++) {
            if(i%2 == 0)
            System.out.println(i);
        }

        int[] numbers = new int[10];

        for(int ix = 0; ix < numbers.length; ix++) {

            numbers[ix] = ix * 2;

        }

        System.out.println(numbers[3]);
    }

}


