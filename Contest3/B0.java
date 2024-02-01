import java.util.Scanner;

public class B0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 1......
        for(int i=1 ; i<=n ; i++)
            System.out.print(i + " ");
        System.out.println();
        // 2......
        for(int i=n ; i>=0 ; i-- )
            System.out.print(i + " ");
        System.out.println();
        // 3......
        for(int i=0 ; i<=n ; i++ ){
            if(i%2==0)
                System.out.print(i + " ");
        }
        System.out.println();
        // 4......
        for(int i=0 ; i<=n ; i++ ){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        // 5......
        for(int i=0 ; i<n ; i++ ){
            if(i %4==0)
                System.out.print(i + " ");
        }
        System.out.println();
        // 6......
        for(int i=1 ; i<=n ;i++ ){
            System.out.print((char)(i+96) + " ");
        }
        System.out.println();
        // 7......
        for(int i=1 ;i<=n ; i++ ){
            System.out.print((char)(122-n+i) + " ");
        }
    }
}
