import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[][] arr = new Integer[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = (sc.nextInt());
            arr[i][1] = (sc.nextInt());
        }
        Arrays.sort(arr, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                double kc1 = Math.sqrt(o1[0] * o1[0] + o1[1] * o1[1]);
                double kc2 = Math.sqrt(o2[0] * o2[0] + o2[1] * o2[1]);
                if (kc1 < kc2) {
                    return -1;
                } else if (kc1 > kc2) {
                    return 1;
                } else {
                    if (o1[0] != o2[0]) {
                        return o1[0] - o2[0];
                    } else if (o1[1] != o2[1]) {
                        return o1[1] - o2[1];
                    } else {
                        return 0;
                    }
                }
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
