import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;

public class B12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        if ((month >= 1 && month <= 12) && (year > 0)) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                System.out.println(31);
            else if (month == 4 || month == 6 || month == 9 || month == 11)
                System.out.println(30);
            else {
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                    System.out.println(29);
                else
                    System.out.println(28);
            }
        }
        else
            System.out.println("INVALID");
    }
}
