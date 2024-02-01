import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.next();
        String s = sc.nextLine();
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'C')
                cnt1++;
            if (s.charAt(i) == '+') cnt2++;
        }
        if(cnt1 >= 1 && cnt2 >= 2 )
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
