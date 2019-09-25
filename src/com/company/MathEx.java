package com.company;

public class MathEx {
    public static int swap(int number){
        int first = (number/10)%10;
        int second = number%10;
        int other = number/100;
        return other*100 + second*10 + first;
    }

    public static void timeLeft(int hour1, int minute1, int hour2, int minute2){
        int hour1minutes = (hour1)*60;
        int hour2minutes = (hour2)*60;

        int time1 = hour1minutes + minute1;
        int time2 = hour2minutes + minute2;

        int timediff = (time2 - time1);

        int hourfinal = timediff/60;
        int minutefinal = timediff%60;

        System.out.println("There are " + hourfinal + " hours and " + (minutefinal) + " minutes left" );
    }

    public static int dayOfWeek(int firstday, int chosenday){
        int weekday = (chosenday - 1 + firstday)%7;
        return weekday;
    }
}
