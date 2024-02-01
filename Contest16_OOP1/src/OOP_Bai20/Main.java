package OOP_Bai20;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        while (t-- > 0) {
            int h = sc.nextInt();
            int p = sc.nextInt();
            int s = sc.nextInt();
            Time tmp = new Time(h, p, s);
            arr.add(tmp);
            Collections.sort(arr, new Comparator<Time>() {
                @Override
                public int compare(Time o1, Time o2) {
                    return o1.toSeconds() - o2.toSeconds();
                }
            });
        }
        for (Time x : arr) System.out.println(x);
    }
}
