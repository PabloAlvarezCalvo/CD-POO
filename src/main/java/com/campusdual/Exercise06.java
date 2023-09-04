package com.campusdual;

import java.util.Calendar;

public class Exercise06 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        int month = cal.get(Calendar.MONTH) + 1;

        int hour =  cal.get(Calendar.HOUR);

        String season;

        switch (month){
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;

            case 3:
            case 4:
            case 5:
                    season = "Spring";
                break;

            case 6:
            case 7:
            case 8:
                    season = "Summer";
                break;

            case 9:
            case 10:
            case 11:
                    season = "Autumn";
                break;

            default:
                throw new IllegalArgumentException("Month out of valid range");
        }

        System.out.println(season);
    }
}
