import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        int left = (int) Math.sqrt(a);
        int right = (int) Math.sqrt(b);
        if ((long) left * left < a) left++;
        for (int i = left; i <= right; i++) {
            System.out.print((long) i * i + " ");
        }
    }
}
