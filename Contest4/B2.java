import java.util.Scanner;

public class B2 {
    public static int ham1(long n){
        if(n == 0) return 1;
        int dem = 0;
        while(n != 0){
            if(n % 2 == 0){
                ++dem;
            }
            n /= 10;
        }
        if(dem % 2 == 1) return 1;
        else return 0;
    }

    public static int ham2(long n){
        if(n == 0) return 1;
        int chan = 0, le = 0;
        while(n != 0){
            if(n % 2 == 0){
                ++chan;
            }
            else{
                ++le;
            }
            n /= 10;
        }
        if(chan > le) return 1;
        else return 0;
    }

    public static int ham3(long n){
        long last = n % 10;
        while(n >= 10){
            n /= 10;
        }
        if(last == n) return 1;
        else return 0;
    }

    public static int ham4(long n){
        int tong = 0;
        while(n != 0){
            tong += n % 10;
            n /= 10;
        }
        if(tong % 10 == 8){
            return 1;
        }
        else return 0;
    }

    public static boolean nguyenTo(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return n > 1;
    }

    public static int ham5(long n){
        int tong = 0;
        while(n != 0){
            tong += n % 10;
            n /= 10;
        }
        if(nguyenTo(tong)) return 1;
        else return 0;
    }

    public static int ham6(long n){
        while(n >= 10){
            if(Math.abs(n % 10 - (n / 10) % 10) != 1)
                return 0;
            n /= 10;
        }
        return 1;
    }

    public static int ham7(long n){
        int maxDigit = -1;
        while(n >= 10){
            maxDigit = Math.max(maxDigit, (int)(n % 10));
            n /= 10;
        }
        if(n > maxDigit) return 1;
        else return 0;
    }
    public static boolean fibo(long n){
        //kiem tra xem n co phai la so fibonacci thu 0 => 92 ?
        if(n == 0 || n == 1) return true;
        long fn1 = 1, fn2 = 0, fn;
        for(int i = 2; i <= 92; i++){
            fn = fn1 + fn2;
            if(fn == n){
                return true;
            }
            fn2 = fn1;
            fn1 = fn;
        }
        return false;
    }

    public static int ham8(long n){
        int tong = 0;
        while(n != 0){
            tong += n % 10;
            n /= 10;
        }
        if(fibo(tong)) return 1;
        else return 0;
    }

    public static boolean thuanNghich(int n){
        int rev = 0, tmp = n;
        while(n != 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev == tmp;
    }

    public static int ham9(long n){
        int tong = 0;
        while(n != 0){
            tong += n % 10;
            n /= 10;
        }
        if(thuanNghich(tong)) return 1;
        else return 0;
    }

    public static int ham10(long n){
        while(n != 0){
            int r = (int)(n % 10);
            if(r != 0 && r != 6 && r != 8) return 0;
            n /= 10;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            System.out.println(ham1(n));
            System.out.println(ham2(n));
            System.out.println(ham3(n));
            System.out.println(ham4(n));
            System.out.println(ham5(n));
            System.out.println(ham6(n));
            System.out.println(ham7(n));
            System.out.println(ham8(n));
            System.out.println(ham9(n));
            System.out.println(ham10(n));
            System.out.println("");
        }
    }
}