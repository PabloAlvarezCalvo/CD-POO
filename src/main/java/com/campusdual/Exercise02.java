package com.campusdual;

public class Exercise02 {
    public static void main(String[] args) {
        //Dado un radio 15 calcular área del círculo y longitud de la circunferencia
        double r = 15.0;
        double area = Math.PI * Math.pow(r, 2);
        double length = 2 * Math.PI * r;

        System.out.printf("For a radium of %.2f mm the area of the circle is %.2f mm^2, and the length of the circumference is: %.2f mm.\n", r, area, length);

    }
}
