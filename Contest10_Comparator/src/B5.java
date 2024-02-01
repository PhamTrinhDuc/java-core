import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[][] arr = new Integer[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }
        Arrays.sort(arr, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if (o1[0] != o2[0])
                    return o1[0] - o2[0];
                if (o1[1] != o2[1])
                    return o1[1] - o2[1];
                if (o1[2] != o2[2])
                    return o1[2] - o2[2];
                return 0;
            }
        });
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1] + " " + arr[i][2]);
        }
    }
}
