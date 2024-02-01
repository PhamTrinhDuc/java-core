
import java.io.*;
import java.util.*;
public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0 ;
        for(int i=1 ; i<=n ; i++ ){
            sum += i ;
        }
        System.out.print(sum);
    }
}

    