package com.campusdual;

public class Exercise04 {
    public static void main(String[] args) {
        //Suma de los 5 primeros números
        int sum5 = 1 + 2 + 3 + 4 + 5;

        /*
        int suma5 = 0;

        for (int i = 1; i < 6; i++){
            suma += i;
        }
        */

        System.out.printf("Total sum of the 5 first natural numbers is: %d.\n", sum5);


        //Suma de los 20 primeros números pares
        int sum20 = 2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40;

        /*
        int sum20 = 0;
        for (int i = 1; i < 21; i++){
            sum20 += i * 2;
        }
        */

        System.out.printf("Total sum of 20 first even numbers is: %d.\n", sum20);
    }
}
