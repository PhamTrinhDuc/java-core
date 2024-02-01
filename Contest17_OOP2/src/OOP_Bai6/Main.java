package OOP_Bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        String[] arr = tmp.split(":");
        int hour = Integer.parseInt(arr[0]);
        int minute = Integer.parseInt(arr[1]);
        int second = Integer.parseInt(arr[2]);
        MyTime myTime = new MyTime(hour, minute, second);

        myTime.getNextSecond();
        System.out.println(myTime);
        myTime.getAfterSecond();

        myTime.getNextMinute();
        System.out.println(myTime);
        myTime.getAfterMinute();

        myTime.getNextHour();
        System.out.println(myTime);
        myTime.getAfterHour();

        myTime.getAfterSecond();
        System.out.println(myTime);
        myTime.getNextSecond();

        myTime.getAfterMinute();
        System.out.println(myTime);
        myTime.getNextMinute();

        myTime.getAfterHour();
        System.out.println(myTime);
        myTime.getNextHour();
    }
}
