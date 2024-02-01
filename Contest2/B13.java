import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;

public class B13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int year = n / 365;
        int tmp = n - (n / 365) * 365;
        int week = tmp / 7;
        int date = tmp - (tmp / 7) * 7;
        System.out.println(year + " " + week + " " + date);
    }
}
