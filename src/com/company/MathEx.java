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
        return (chosenday - 1 + firstday)%7;
    }
    public static void main(String[] args) {
        int a = swap(123);
        System.out.println(a);

        timeLeft(1,15,4,36);
        timeLeft(1,34,8,20);

        int b = dayOfWeek(0,1);
        System.out.println(b);
        b = dayOfWeek(0, 14);
        System.out.println(b);
        b = dayOfWeek(6,22);
        System.out.println(b);
        b = dayOfWeek(5,4);
        System.out.println(b);
        b = dayOfWeek(1,24);
        System.out.println(b);
        b = dayOfWeek(2,1);
        System.out.println(b);

        /* Output:
        132
        There are 3 hours and 21 minutes left
        There are 6 hours and 46 minutes left
        0
        6
        6
        1
        3
        2
        */
    }
}
