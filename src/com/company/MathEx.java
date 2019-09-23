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

        double timediff = (time2 - time1)*60;
        System.out.println(timediff);
        int timefixed = (int)(timediff);

        int hourfinal = timefixed/100;
        int minutefinal1 = (timefixed/10)%10;
        int minutefinal2 = timefixed%10;

        System.out.println("There are " + hourfinal + " hours and " + (minutefinal1*60)+(minutefinal2) + " minutes left" );
    }
}
