import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B1 {
    public static int ham1(int n) {
        if (n < 2) return 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int ham2(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int ham3(int n) {
        int sum = 0;
        while (n != 0) {
            if (n % 10 % 2 == 0) {
                sum += n % 10;
            }
            n /= 10;
        }
        return sum;
    }

    public static int ham4(int n) {
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            if (r == 2 || r == 3 || r == 5 || r == 7) {
                sum += r;
            }
            n /= 10;
        }
        return sum;
    }

    public static int ham5(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static int ham6(int n) {
        int dem = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                ++dem;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n > 1) dem++;
        return dem;
    }

    public static int ham7(int n) {
        int ans = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                ans = i;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n > 1) ans = n;
        return ans;
    }

    public static int ham8(int n) {
        while (n != 0) {
            if (n % 10 == 6) return 1;
            n /= 10;
        }
        return 0;
    }

    public static int ham9(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum % 8 == 0 ? 1 : 0;
    }

    public static int gt(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++)
            res *= i;
        return res;
    }

    public static int ham10(int n) {
        int sum = 0;
        while (n != 0) {
            sum += gt(n % 10);
            n /= 10;
        }
        return sum;
    }

    public static int ham11(int n) {
        int r = n % 10;
        while (n != 0) {
            if (n % 10 != r) return 0;
            n /= 10;
        }
        return 1;
    }

    public static int ham12(int n) {
        int r = n % 10;
        while (n != 0) {
            if (n % 10 > r) return 0;
            n /= 10;
        }
        return 1;
    }

    public static int ham13(int n) {
        int sum = 0;
        int d = count(n);
        while (n != 0) {
            sum += Math.pow(n % 10, d);
            n /= 10;
        }
        return sum;
    }

    public static int count(int n) {
        int dem = 0;
        while (n != 0) {
            ++dem;
            n /= 10;
        }
        return dem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

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
        System.out.println(ham11(n));
        System.out.println(ham12(n));
        System.out.println(ham13(n));

        scanner.close();
    }
}