package com.company;

public class MathEx {
    public static int swap(int number){
        int first = (number/10)%10;
        int second = number%10;
        int other = number/100;
        return other*100 + second*10 + first;
    }

    public static void timeLeft(int hour1, int minute1, int hour2, int minute2){
        double minute1percent = (double)(minute1)/60;
        double minute2percent = (double)(minute2)/60;

        double time1 = hour1 + minute1percent;
        double time2 = hour2 + minute2percent;

        int timediff = (int) ((time2 - time1)*100);

        int hourfinal = timediff/100;
        int minutefinal = (int) ((timediff%100)*0.6);

        System.out.println("There are " + hourfinal + " hours and " + (minutefinal) + " minutes left" );
    }

    public static int dayOfWeek(int firstday, int chosenday){
        int weekday = (chosenday-1)%6;
        return weekday;
    }
}
