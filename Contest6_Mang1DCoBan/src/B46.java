import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

//chia het cho 28

public class B46 {
    public static int[] cnt = new int[30];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            cnt[a[i] % 28]++;
        }
        long res = 0 ;
        long Cap_0 = (long) cnt[0] * (cnt[0] - 1) / 2;
        long Cap_14 = (long) cnt[14] * (cnt[14] - 1) / 2;
        for(int i=1 ; i<=13 ; i++ ){
            res += (long)cnt[i]*cnt[28-i] ;
        }
        res = res + Cap_0 + Cap_14;
        System.out.println(res);
    }
}
