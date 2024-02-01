import java.util.Scanner;
import java.util.HashSet;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

// phan tu phan biet

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            set.add(tmp);
        }
        System.out.println(set.size());
    }
}
