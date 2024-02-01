import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[][] arr = new Integer[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if (Math.abs(o1[0] - o1[1]) != Math.abs(o2[0] - o2[1]))
                    return Math.abs(o1[0] - o1[1]) - Math.abs(o2[0] - o2[1]);
                if (o1[0] != o2[0])
                    return o1[0] - o2[0];
                return o2[1] - o1[1];
            }
        });
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
