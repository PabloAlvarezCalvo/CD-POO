package com.campusdual;

import java.time.LocalDateTime;

public class Exercise05 {
    //Comprobar si un número es positivo o negativo
    //Comprobar si un número es múltiplo de otro
    //Comprobar si un número es menor que otro

    public static void main(String[] args) {

        System.out.println("Number 4 is a positive number?: " + isPositive(4));

        System.out.println("Number 4 is factor of 2?: " + isFactorOf(4, 2));

        System.out.println("Numer 4 is smaller than 2?: " + isLessThan(4, 2));
    }

    private static boolean isPositive(int n1){
        return n1 > 0;
    }

    private static boolean isFactorOf(int n1, int factor){
        return n1 % factor == 0;
    }

    private static boolean isLessThan(int n1, int smaller){
        return n1 < smaller;
    }
}
